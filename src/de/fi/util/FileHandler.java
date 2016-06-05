package de.fi.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import de.fi.person.Person;

public class FileHandler {

	private String filename;
	private BufferedReader in;
	
	private final String FILE_SEPERATOR = File.separator;
	private String delimiter = "#";

	public void setFilename(String filename) {
		this.filename = "assets" + FILE_SEPERATOR + filename;
	}
	
	
	public void processDocument(){
		File document = new File(this.filename);
		String[] data = null;
		ArrayList<String[]> daten = new ArrayList<String[]>();
		
		if (!document.exists()) {
			try {
				document.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			String personInZeile;
			try {
				in = new BufferedReader(new FileReader(document));
				while ((personInZeile = in.readLine())!= null){
					data = personInZeile.split("\\"+ delimiter );
					System.out.println(personInZeile);	
					
					daten.add(data);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("Wert"+ i + " " + data[i]);
		}
		
//		Person.addPerson_in_A(ident, vorname, nachname, geschlecht);
	}
	
	
}
