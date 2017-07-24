package co.edureka;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParserDemo {

	void parseXML(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edurekapersons.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // This operation reads the XML file as in a Tree Data Structure
			
			System.out.println("Root of document is: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("person");
			System.out.println("Length of nodeList is: "+nodeList.getLength());
			
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i); // to get the node
				//System.out.println("Node name is: "+node.getNodeName());
				
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element elemnt = (Element)node;
					String name = elemnt.getElementsByTagName("name").item(0).getTextContent();
					String address = elemnt.getElementsByTagName("address").item(0).getTextContent();
					
					System.out.println(name+" - "+address);
					System.out.println("--------------------------");
				}
			}
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		DOMParserDemo dpRef = new DOMParserDemo();
		dpRef.parseXML();

	}

}
