package org.cursjava.PhoneApp;

public class Contact {
    private int id;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(int id, String phoneNumber, String firstName, String lastName){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName =firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Contact info: \n-ID: " + id + "\n-Phone number: " + phoneNumber + "\n-Name: " + firstName + " " + lastName;
    }
}
