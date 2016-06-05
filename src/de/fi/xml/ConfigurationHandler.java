package de.fi.xml;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class ConfigurationHandler extends DefaultHandler {

	int idPos;
	int vornamePos;
	int nachnamePos;
	int geschlechtPos;
	int counter = 0;

	public void startDocument() {
		System.out.println("Dokumentenstart");
	}

	public void startElement(String uri, String localName, String qualName, Attributes attributes) {

		System.out.println("Start-Tag: " + qualName);
		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.println("Attribut: " + attributes.getQName(i) + " = " + attributes.getValue(i));

			if (qualName.equals("field")) {
				System.out.println("field found");
				if (attributes.getQName(i).equals("name") && attributes.getValue(i).equals("id")) {
					this.idPos = counter;
					System.out.println("ID befindet sich an " + this.idPos + ". Stelle");
					counter++;
				} else if (attributes.getQName(i).equals("name") && attributes.getValue(i).equals("vorname")) {
					this.vornamePos = counter;
					System.out.println("Vorname befindet sich an " + this.idPos + ". Stelle");
					counter++;
				} else if (attributes.getQName(i).equals("name") && attributes.getValue(i).equals("nachname")) {
					this.nachnamePos = counter;
					System.out.println("Nachname befindet sich an " + this.idPos + ". Stelle");
					counter++;
				} else if (attributes.getQName(i).equals("name") && attributes.getValue(i).equals("geschlecht")) {
					this.geschlechtPos = counter;
					System.out.println("Geschlecht befindet sich an " + this.idPos + ". Stelle");
					counter++;
				}
			}

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
