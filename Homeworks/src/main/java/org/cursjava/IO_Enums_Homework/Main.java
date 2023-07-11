package org.cursjava.IO_Enums_Homework;

import org.cursjava.IO_Enums_Homework.Comparators.BiathlonResultComparator;
import org.cursjava.IO_Enums_Homework.Comparators.CountryComparator;
import org.cursjava.IO_Enums_Homework.Comparators.NameComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BiathlonResult athlete1 = new Athlete("Christian", "RO", new BiathlonResult(3.0, 3.0, 3.0, 3.0)).getBiathlonResults();
        BiathlonResult athlete2 = new Athlete("Andrei", "GB", new BiathlonResult(4.0, 4.0, 4.0, 4.0)).getBiathlonResults();
        BiathlonResult athlete3 = new Athlete("Michael", "USA", new BiathlonResult(1.0, 1.0, 1.0, 1.0)).getBiathlonResults();

        List<BiathlonResult> athleteList = new ArrayList<>();
        athleteList.add(athlete1);
        athleteList.add(athlete2);
        athleteList.add(athlete3);

        //TODO: review

        for (BiathlonResult athlete : athleteList) {
            athleteList.sort(new BiathlonResultComparator());
            System.out.println(athleteList);


        }

    }
}
