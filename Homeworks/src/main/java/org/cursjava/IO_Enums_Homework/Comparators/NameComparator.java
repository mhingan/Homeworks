package org.cursjava.IO_Enums_Homework.Comparators;

import org.cursjava.IO_Enums_Homework.Athlete;

import java.util.Comparator;

public class NameComparator implements Comparator<Athlete> {
    /**
     * This class was made for test purposes only.
     * Used to sort the athletes by their name;
     * **/
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
