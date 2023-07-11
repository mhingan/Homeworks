package org.cursjava.IO_Enums_Homework.Comparators;

import org.cursjava.IO_Enums_Homework.Athlete;

import java.util.Comparator;

public class CountryComparator implements Comparator<Athlete> {

//TODO - this comparator is working
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getCountryCode().compareTo(o2.getCountryCode());
    }
}
