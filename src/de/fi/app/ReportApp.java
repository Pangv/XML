package de.fi.app;

import java.io.File;

import javax.swing.JFileChooser;

import org.xml.sax.SAXException;

import de.fi.person.Person;
import de.fi.util.InputHandler;
import de.fi.util.OutputHandler;
import de.fi.xml.CallSAX;
import de.fi.xml.Configuration;

public class ReportApp {

	public static void main(String[] args) throws SAXException {

		File currentDir = new File("assets\\");
		CallSAX strukturdatei_1 = new CallSAX();
		CallSAX strukturdatei_2 = new CallSAX();
		InputHandler.openStdReader();
		CallSAX.createSAXParser();

		System.out.print("Dateiname: ");

		JFileChooser jfc = new JFileChooser();
		jfc.setCurrentDirectory(currentDir);
		jfc.showOpenDialog(null);

		strukturdatei_1.setFilename(jfc.getSelectedFile().getName());
		strukturdatei_1.parseXMLDocument();
		
		jfc.showOpenDialog(null);
		strukturdatei_2.setFilename(jfc.getSelectedFile().getName());
		strukturdatei_2.parseXMLDocument();
		
		
		Configuration.getConfigurations();
		
		
		Person.comparePerson(Person.personen_in_A.get(0), Person.personen_in_B.get(0));
		
		
		InputHandler.closeReaders();

	}

}
