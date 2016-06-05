package de.fi.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
	
	
	private static BufferedReader br;

	
	
	public static void openStdReader(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static String readString(){
		String toReturn = "";
		try {
			toReturn = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return toReturn;
	}
	
	
	public static void closeReaders(){
		try {
			br.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	

}
