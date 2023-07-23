package org.cursjava.ObjectContainers_Tema.comparators;

import org.cursjava.ObjectContainers_Tema.Person;

import java.util.Comparator;

public class ageComparator implements Comparator<Person> {
    /**
     * The class @ageComparator implements the Comparator interface and is comparing the age of two objects (in this case 2 Persons);
     * I added the @nameComparator and @ageComparator files in a new package for an easy understanding of the project;
     **/
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
