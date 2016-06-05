package de.fi.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import de.fi.person.Person;

public class FileHandler {

	private File input;
	private BufferedReader in;
	
	
	public void processDocument(File document){
		
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
//					if ()					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
//		Person.addPerson_in_A(ident, vorname, nachname, geschlecht);
	}
	
	
}
