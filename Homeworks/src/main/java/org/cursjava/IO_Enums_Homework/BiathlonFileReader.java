package org.cursjava.IO_Enums_Homework;

import org.cursjava.IO_Enums_Homework.Comparators.FinalTimeComparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BiathlonFileReader {

    /**
     * @readCSVFile = this method has as parameter a String for the file name (path) and is returning a List of athletes;
     *              - inside the method a new BufferedRead object is created and the path of the file is specified;
     *              - using a while loop the program checks if the lines of the CSV file are empty. If so the program stop, else keep reading;
     *              - at the end, we return a sorted list (sorted by @FinalTimeComparator);
     * **/
    public static List<Athlete> readCSVFile(String fileName) throws IOException {
        List<Athlete> athleteList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;

        while((line = bufferedReader.readLine()) != null){
            String[] token =line.split(",");
            Athlete athlete = new Athlete(
                    Integer.parseInt(token[0]),
                    token[1],
                    token[2],
                    Double.parseDouble(token[3]),
                    token[4],
                    token[5],
                    token[6]
            );
            athleteList.add(athlete);
        }

        bufferedReader.close();
        athleteList.sort(new FinalTimeComparator());
        return athleteList;

    }
    /**
     *@calculateStandings - method used to sort the list of athletes;
     * **/
     static List<Athlete> calculateStandings(List<Athlete> athletes) {
        athletes.sort(new FinalTimeComparator());
        return athletes;
    }

     static String getMedalString(Medals medal, Athlete athlete) {
        return medal.name() + " - " + athlete.getName() + " " + athlete.getSkiTime() +
                " (" + athlete.calculateFinalTime() + ")";
    }


}
