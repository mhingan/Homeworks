package org.cursjava.IO_Enums_Homework.Comparators;

import org.cursjava.IO_Enums_Homework.BiathlonResult;

import java.util.Comparator;

public class BiathlonResultComparator implements Comparator<BiathlonResult> {

    //TODO - create the comparator for biathlon results
    @Override
    public int compare(BiathlonResult o1, BiathlonResult o2) {
        return o1.getBiathlonResults().compareTo(o2.getBiathlonResults());
    }
}
