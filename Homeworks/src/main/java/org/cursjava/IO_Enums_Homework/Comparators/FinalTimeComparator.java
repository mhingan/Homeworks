package org.cursjava.IO_Enums_Homework.Comparators;

import org.cursjava.IO_Enums_Homework.Athlete;

import java.util.Comparator;

public class FinalTimeComparator implements Comparator<Athlete> {
    /**This comparator is used to sort the list of athletes by their final time (after penalties).**/
    public int compare(Athlete athlete1, Athlete athlete2) {

        return Integer.compare((int) athlete1.calculateFinalTime(), (int) athlete2.calculateFinalTime());
    }
}
