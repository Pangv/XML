package de.fi.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.XMLReader;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class CallSAX {

	private String filename;
	private static SAXParserFactory factory;
	private static XMLReader xmlReader;
	private static SAXParser saxParser;

	public void setFilename(String filename) {
		this.filename = "assets\\" + filename;
	}

	public String getFilename() {
		return filename;
	}

	public void checkValidity() {

	}
	/*
	 * Einmal erstellen reicht
	 */
	public static void createSAXParser() {
		factory = SAXParserFactory.newInstance();
		try {
			saxParser = factory.newSAXParser();
			xmlReader = saxParser.getXMLReader();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		xmlReader.setContentHandler(new ConfigurationHandler());
		xmlReader.setErrorHandler(new ConfigErrorHandler());
	}

	public void parseXMLDocument(){
		try {
			xmlReader.parse(new File(filename).toURI().toURL().toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			
			e.printStackTrace();
		}
	}

}
