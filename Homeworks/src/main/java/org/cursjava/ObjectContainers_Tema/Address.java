package org.cursjava.ObjectContainers_Tema;

public class Address {
    /**
     * Creating the variables for my Address list class;
     *
     * @street - used to declare the @street of where the hobby can be practice;
     * @city - used to declare the @city of where the hobby can be practice;
     * @country - used to declare the @country of where the hobby can be practice;
     **/
    private String street;
    private String city;
    private String country;

    /**
     * Creating the constructor for Address class;
     **/
    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    /**
     * @getCountry - this get method is returning the country of where the hobby can be practiced;
     **/
    public String getCountry() {
        return country;
    }
}
