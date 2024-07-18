package com.cc.java;

public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String property) {
        switch (property.toLowerCase()) {
            case "familyname":
                return "Family Name: " + this.familyName;
            case "firstname":
                return "First Name: " + this.firstName;
            case "role":
                return "Role: " + this.role;
            case "yearofentry":
                return "Year of Entry: " + this.yearOfEntry;
            default:
                return "Property not found!";
        }
    }
}
