package org.cursjava.Java_8_Homework;

import org.cursjava.Java_8_Homework.Exceptions.PersonNotFoundException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonHandler {

    /**
     * getPersonWithAge is a method that takes as input a .txt file containing records in the format "@firstname, @lastName, @dateOfBirth".
     * It processes the input file and generates a new .txt file that includes the first and last names of persons with a specific age.
     *
     * @param fileName    The path to the input .txt file containing the records of persons.
     * @param newFileName The path to the output .txt file that will be created with first and last names of persons with the specific age.
     * @param age         The specific age to filter the persons.
     * @throws IOException             If there are any issues with reading or writing the files.
     * @throws PersonNotFoundException If there are no persons with the specified age;
     */

    public void getPersonsWithAge(String fileName, String newFileName, int age) throws IOException, PersonNotFoundException {
        int todayYear = LocalDate.now().getYear();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        List<Person> personList = Files.lines(Paths.get(fileName))
                // Using .map, split each line of the file into an array of words using regex: ","
                .map(line -> line.split(","))
                // Using .filter, create an array of tokens (words) and filter out lines with exactly 3 tokens
                .filter(tokens -> tokens.length == 3)
                // Using map, create new variables and assign each token to them
                // Create a Person object and assign the variables to it
                .map(tokens -> {
                    String firstName = tokens[0];
                    String lastName = tokens[1];
                    LocalDate dateOfBirth = LocalDate.parse(tokens[2], dateFormatter);
                    return new Person(firstName, lastName, dateOfBirth);
                })
                // Filter the persons to keep only those with a specific age
                .filter(person -> todayYear - person.getDateOfBirth().getYear() == age)
                // Sort the persons with the specific age based on their last names
                .sorted(Comparator.comparing(Person::getLastName))
                // Collect the persons into a list
                .collect(Collectors.toList());


        if (personList.isEmpty()) {
            throw new PersonNotFoundException("Person with age " + age + " was not found.");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileName))) {
            for (Person person : personList) {
                bufferedWriter.write(person.getFirstName() + " " + person.getLastName() + "\n");
            }
        }

        System.out.println(personList);
    }
}
