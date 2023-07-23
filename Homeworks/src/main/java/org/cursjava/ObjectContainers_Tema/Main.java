package org.cursjava.ObjectContainers_Tema;

import org.cursjava.ObjectContainers_Tema.comparators.ageComparator;
import org.cursjava.ObjectContainers_Tema.comparators.nameComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Creating 3 Person object with name, age and a list of Hobbies;
         * **/
        Person person1 = new Person("Andrei", 23, new ArrayList<>());
        Person person2 = new Person("Mihai", 45, new ArrayList<>());
        Person person3 = new Person("Marius", 16, new ArrayList<>());

        /**
         * Creating two TreeSets that order persons by age and name;
         * **/
        TreeSet<Person> personByAge = new TreeSet<>(new ageComparator());
        TreeSet<Person> personByName = new TreeSet<>(new nameComparator());

        /**
         *Adding person to age TreeSet
         * **/
        personByAge.add(person1);
        personByAge.add(person2);
        personByAge.add(person3);

        /**
         *Adding person to name TreeSet
         * **/
        personByName.add(person1);
        personByName.add(person2);
        personByName.add(person3);

        /**
         *Using a for loop we iterate through the @personByName list and print the person in ascending order;
         * **/
        for (Person person : personByAge) {
            System.out.println("Name: " + person.getName() + " -Age: " + person.getAge());
        }
        System.out.println("\n----------------------------------------------\n");

        /**
         *Using a for loop we iterate through the @personByAge list and print the person in ascending order;
         * **/
        for (Person person : personByName) {
            System.out.println("Name: " + person.getName() + " -Age: " + person.getAge());
        }

        /**
         * Creating a new HashMap of hobbies;
         * **/
        HashMap<Person, List<Hobby>> hobbiesMap = new HashMap<>();

        /**
         * Creating the hobbies with a name, frequency and a list of Addresses;
         * **/
        Hobby hobby1 = new Hobby("Swimming", 3, Arrays.asList(
                new Address("Street 4", "Manhattan", "USA"),
                new Address("Street 21", "Dubai", "UAE")
        ));

        Hobby hobby2 = new Hobby("Photography", 5, Arrays.asList(
                new Address("Street 10", "Paris", "France"),
                new Address("Street 8", "Tokyo", "Japan")
        ));

        Hobby hobby3 = new Hobby("Gardening", 2, Arrays.asList(
                new Address("Street 15", "London", "UK"),
                new Address("Street 7", "Sydney", "Australia")
        ));

        Hobby hobby4 = new Hobby("Cooking", 4, Arrays.asList(
                new Address("Street 12", "Rome", "Italy"),
                new Address("Street 3", "Cape Town", "South Africa")
        ));

        /**
         * Assign hobbies to persons;
         * **/
        person1.addHobby(hobby3);
        person2.addHobby(hobby1);
        person3.addHobby(hobby2);
        person3.addHobby(hobby4);

        /**
         * Getting the hobbies from the HashMap
         * **/
        hobbiesMap.put(person1, person1.getHobbies());
        hobbiesMap.put(person2, person2.getHobbies());
        hobbiesMap.put(person3, person3.getHobbies());

        /**
         * Creating a for loop that iterate through the HashMap and print the person name, hobby and address;
         * **/
        for (Map.Entry<Person, List<Hobby>> entry : hobbiesMap.entrySet()) {
            Person person = entry.getKey();
            List<Hobby> hobbies = entry.getValue();

            System.out.println("Person: " + person.getName());
            for (Hobby hobby : hobbies) {
                System.out.println("Hobby: " + hobby.getName());
                for (Address address : hobby.getAddresses()) {
                    System.out.println("Country: " + address.getCountry());
                }
            }
        }
    }
}
