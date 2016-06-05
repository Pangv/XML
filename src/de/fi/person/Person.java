package de.fi.person;

import java.io.File;
import java.util.ArrayList;

public class Person {

	private String ident;

	private String vorname;
	private String nachname;
	private String geschlecht;

	private File input;

	// private static ArrayList<ArrayList<Person>> listen = new ArrayList<ArrayList<Person>>();
	public static ArrayList<Person> personen_in_A = new ArrayList<Person>();
	public static ArrayList<Person> personen_in_B = new ArrayList<Person>();

	public Person(String ident, String vorname, String nachname, String geschlecht) {
		this.ident = ident;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
	}

	public static void addPerson_in_A(String ident, String vorname, String nachname, String geschlecht) {
		personen_in_A.add(new Person(ident, vorname, nachname, geschlecht));
	}

	public static void addPerson_in_B(String ident, String vorname, String nachname, String geschlecht) {
		personen_in_B.add(new Person(ident, vorname, nachname, geschlecht));
	}

	public static void comparePerson(Person a, Person b) {
		if (true) {
			System.out.println("Personen " + a.ident + " & " + b.ident + " sind identisch");
		} else {
			System.out.println("Personen sind nicht identisch");
		}
	}

}
