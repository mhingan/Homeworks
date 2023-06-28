package org.cursjava.ObjectContainers_Tema.comparators;

import org.cursjava.ObjectContainers_Tema.Person;

import java.util.Comparator;

public class ageComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
