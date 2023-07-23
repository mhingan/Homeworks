package org.cursjava.ObjectContainers_Tema;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    /**
     * Creating teh variables for Hobby list class;
     *
     * @name - define the name of the hobby;
     * @frecuency - this int variable is used to store the frequency of a hobby;
     * @List<Address> - an Address list is declared in order to store the addresses of the hobbies;
     **/
    private String name;
    private int frequency;
    private final List<Address> addresses;

    /**
     * Creating the constructor for Hobby class;
     **/
    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = new ArrayList<>();
    }

    /**
     * @getName; @getFrequency; @getAddresses - getter methods that are returning the name, frequency or address of a hobby;
     **/
    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }


}

