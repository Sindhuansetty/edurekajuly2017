package co.edureka;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class SAXHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("===Parsing Started===");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.print(new String(ch,start,length));
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("===Parsing Ending===");
	}
	
}

public class SAXParserDemo {

	public static void main(String[] args) {
		
		// API's they might throw some exception (checked exceptions) -> try catch to handle the same
		
		try {
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();//SAXParserFactory.newInstance().newSAXParser();
			
			File file = new File("/Users/ishantkumar/Downloads/edurekapersons.xml");
			FileInputStream fis = new FileInputStream(file);
			
			SAXHandler handler = new SAXHandler();
			
			parser.parse(fis, handler); // Read the XML File as in stream of events -> startDoc, endDoc, startElm, characters
			
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}


	}

}
