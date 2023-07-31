package org.cursjava.IO_Enums_Homework;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        /**Create a new BiathlonFileReader object; **/
        BiathlonFileReader fileReader = new BiathlonFileReader();

        /**Creating a list of Athletes that is equal with some data from a csv file. **/
        List<Athlete> athletes = fileReader.readCSVFile("src/main/resources/BiathlonResults.csv");


        /**Print the athletes list (sorted by Final Time). **/
        System.out.println(athletes);

        //PRINT THE WINNERS USING .getMedalString method;
        String first = BiathlonFileReader.getMedalString(Medals.GOLD, athletes.get(0));
        String second = BiathlonFileReader.getMedalString(Medals.SILVER, athletes.get(1));
        String third = BiathlonFileReader.getMedalString(Medals.BRONZE, athletes.get(2));

        System.out.println("RESULTS: " +
                "\nWINNER: " + first +
                "\nRUNNER-UP: " + second +
                "\nTHIRD PLACE: " + third);


    }
}
