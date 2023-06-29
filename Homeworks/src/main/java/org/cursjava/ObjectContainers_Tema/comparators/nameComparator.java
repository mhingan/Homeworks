package org.cursjava.ObjectContainers_Tema.comparators;

import org.cursjava.ObjectContainers_Tema.Person;

import java.util.Comparator;

public class nameComparator implements Comparator<Person> {
    /**
     * The class @nameComparator implements the Comparator interface and is comparing the name of two objects (in this case 2 Persons);
     * I added the @nameComparator and @ageComparator files in a new package for an easy understanding of the project;
     **/
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
