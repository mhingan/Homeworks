package org.cursjava.Java_8_Homework;

import org.cursjava.Java_8_Homework.Exceptions.PersonNotFoundException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonHandler {

    String fileName = "src/main/resources/Java8/Persons.txt";
    String newFileName = "src/main/resources/Java8/PersonsWithAge.txt";

    public void getPersonsWithAge(String fileName, String newFileName, int age) throws IOException, PersonNotFoundException {
        int todayYear = LocalDate.now().getYear();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileName));
        String line;
        List<Person> personList = new ArrayList<>();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(",");

            String firstName = tokens[0];
            String lastName = tokens[1];
            LocalDate dateOfBirth = LocalDate.parse(tokens[2], dateFormatter);
            int yearOfBirth = dateOfBirth.getYear();

            Person person = new Person(firstName, lastName, dateOfBirth);
            int calculatedAge = todayYear - yearOfBirth;

            if (calculatedAge == age) {
                personList.add(person);
            }
        }

        bufferedReader.close();

        if (personList.isEmpty()) {
            throw new PersonNotFoundException("Person with age " + age + " was not found.");
        }

        personList.sort(Comparator.comparing(Person::getLastName));

        //writing only the first and last name in the new file;
        for (Person person : personList) {
            bufferedWriter.write( person.getFirstName() + " " + person.getLastName() + "\n");
        }

        System.out.println(personList);

        bufferedWriter.close();
    }
}
