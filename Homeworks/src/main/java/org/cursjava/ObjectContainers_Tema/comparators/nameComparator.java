package org.cursjava.ObjectContainers_Tema.comparators;

import org.cursjava.ObjectContainers_Tema.Person;

import java.util.Comparator;

public class nameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
