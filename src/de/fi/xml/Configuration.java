package de.fi.xml;

import java.util.ArrayList;

public class Configuration {

	private String documentType;
	private String delimeter;

	private  String getDocumentType() {
		return documentType;
	}

	private  String getDelimeter() {
		return delimeter;
	}

	private static ArrayList<Configuration> configs = new ArrayList<Configuration>();

	public Configuration() {
		// empty
	}

	public Configuration(String docType, String delimeter) {
		this.documentType = docType;
		this.delimeter = delimeter;
	}

	public static void addConfiguration(String docType, String delimeter) {
		configs.add(new Configuration(docType, delimeter));
	}

	public static void getConfigurations() {
		for (int i = 0; i < configs.size(); i++) {
			System.out.println(configs.get(i).getDocumentType());
			System.out.println(configs.get(i).getDelimeter());
		}
	}

}
