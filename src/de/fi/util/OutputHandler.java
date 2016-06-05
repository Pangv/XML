package de.fi.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputHandler {
	
	//TODO remove later
	private int identisch = 1;
	private int geloescht=2;
	private int neu=3;
	private int geaendert=5;

	private int i = 1;
	private String filename = "output";
	File output = new File("assets\\" + filename + ".txt");
	
	
	public void createOutputFile() throws Exception{
		output.createNewFile();
		writeToOutput(output);
	}
	
	
	private void writeToOutput(File output){
		try {
			FileWriter fw = new FileWriter(output);
			fw.write("Identische Zeilen: " + identisch);
			fw.append(("\nGelöschte Zeilen: " + geloescht));
			fw.append(("\nNeue Zeilen: " + neu));
			fw.append(("\nGeänderte Zeilen: " + geaendert));
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
