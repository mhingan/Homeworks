package org.cursjava.Java_8_Homework;

import org.cursjava.Java_8_Homework.Exceptions.PersonNotFoundException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, PersonNotFoundException {
        String fileName = "src/main/resources/Java8/Persons.txt";
        String newFileName = "src/main/resources/Java8/PersonsWithAge.txt";

        PersonHandler personHandler = new PersonHandler();
        personHandler.getPersonsWithAge(fileName, newFileName, 21);
    }
}
