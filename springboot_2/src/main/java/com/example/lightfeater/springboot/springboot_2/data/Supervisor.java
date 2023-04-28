package com.example.lightfeater.springboot.springboot_2.data;

public class Supervisor {


    private String firstName;
    private String lastName;
    private String jurisdiction;

    public Supervisor(){

    }


    public Supervisor(String firstName, String lastName, String jurisdiction) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jurisdiction = jurisdiction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
