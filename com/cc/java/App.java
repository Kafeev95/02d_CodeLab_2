package com.cc.java;

public class App {

	public static void main(String[] args) {

		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Schmidt", "Anna", "Developer", 2018);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Müller", "Peter", "Designer", 2015);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        output(mitarbeiter1.getInfo("familyName"));
        output(mitarbeiter1.getInfo("firstName"));
        output(mitarbeiter1.getInfo("role"));
        output(mitarbeiter1.getInfo("yearOfEntry"));

        output(mitarbeiter2.getInfo("familyName"));
        output(mitarbeiter2.getInfo("firstName"));
        output(mitarbeiter2.getInfo("role"));
        output(mitarbeiter2.getInfo("yearOfEntry"));

        output(mitarbeiter3.getInfo("familyName"));
        output(mitarbeiter3.getInfo("firstName"));
        output(mitarbeiter3.getInfo("role"));
        output(mitarbeiter3.getInfo("yearOfEntry"));
	
	}

	

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
