package org.cursjava.IO_Enums_Homework.Comparators;

import org.cursjava.IO_Enums_Homework.Athlete;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public  class NameComparator implements Comparator<Athlete> {

//TODO - this comparator is working
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
