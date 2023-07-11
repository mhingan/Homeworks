package org.cursjava.IO_Enums_Homework;

import org.cursjava.IO_Enums_Homework.Comparators.NameComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("Andrei", "RO", new BiathlonResult(39.24, 44.7, 32.4, 55.11));
        Athlete athlete2 = new Athlete("Christian", "GB", new BiathlonResult(43.24, 41.7, 22.4, 57.11));
        Athlete athlete3 = new Athlete("Michael", "USA", new BiathlonResult(39.14, 34.7, 39.4, 52.11));

        List<Athlete> athleteList = new ArrayList<>();
        athleteList.add(athlete1);
        athleteList.add(athlete2);
        athleteList.add(athlete3);

        for (Athlete athlete : athleteList) {
            //TODO - creare comparatori pentru soratrea in functie de skitime, firts/second/third shooting range;
            athleteList.sort(new Comparator<Athlete>() {
                @Override
                public int compare(Athlete o1, Athlete o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            }
            );
        }

    }
}
