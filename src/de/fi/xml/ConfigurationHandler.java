package de.fi.xml;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class ConfigurationHandler extends DefaultHandler {

	String ident = null, vorname = null, nachname = null, geschlecht = null;

	public void startDocument() {
		System.out.println("Dokumentenstart");
	}

	public void startElement(String uri, String localName, String qualName, Attributes attributes) {

		System.out.println("Start-Tag: " + qualName);
		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.println("Attribut: " + attributes.getQName(i) + " = " + attributes.getValue(i));

		}

	

		if (qualName.equals("info")) {
			Configuration.addConfiguration(attributes.getValue(0), attributes.getValue(1));
		}

	}

	public void characters(char[] charArray, int start, int length) {
		String charString = new String(charArray, start, length);
		charString = charString.replaceAll("\n", "[cr]");
		charString = charString.replaceAll(" ", "[blank]");
		System.out.println(length + " Zeichen: " + charString);

	}

	public void endElement(String uri, String localName, String qualName) {
		System.out.println("End-Tag: " + qualName);
		System.out.println();

	}

	public void endDocument() {
		System.out.println("Dokumentenende");

	
	}

}
