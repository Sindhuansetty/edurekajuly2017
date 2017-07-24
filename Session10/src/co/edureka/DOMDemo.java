package co.edureka;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Person{
	int pid;
	String name;
	String address;
}

public class DOMDemo {

	void generateXMLDocument(Person p){
		try{
		
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // We wish to create a new XML File
			
			Element rootElm = document.createElement("persons");
			Element perElm = document.createElement("person");
			Element idElm = document.createElement("pid");
			Element nameElm = document.createElement("name");
			Element adrsElm = document.createElement("address");
			
			Text idTxt = document.createTextNode(String.valueOf(p.pid));
			Text nameTxt = document.createTextNode(p.name);
			Text adrsTxt = document.createTextNode(p.address);
			
			idElm.appendChild(idTxt);
			nameElm.appendChild(nameTxt);
			adrsElm.appendChild(adrsTxt);
			
			perElm.appendChild(idElm);
			perElm.appendChild(nameElm);
			perElm.appendChild(adrsElm);
			
			rootElm.appendChild(perElm);
			
			document.appendChild(rootElm);
			
			File file = new File("/Users/ishantkumar/Downloads/edurekanewpersons.xml");
			FileOutputStream fos = new FileOutputStream(file);
			
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(fos);
			
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transform = tFactory.newTransformer();
			
			transform.transform(source, result);
			System.out.println("--XML Document Generated--");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.pid = 201;
		p1.name = "George Watson";
		p1.address = "Redwood Shores";
		
		DOMDemo dom = new DOMDemo();
		dom.generateXMLDocument(p1);
		
	}

}
