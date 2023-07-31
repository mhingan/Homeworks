package org.cursjava.IO_Enums_Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BiathlonFileReaderTest {


    @Test
    public void test_athlete_List_Size_and_athlete_Info_success() throws IOException {
        String csvData = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        List<Athlete> athleteList = BiathlonFileReader.readCSVFile(csvData);
        assertEquals(3, athleteList.size());

        Athlete athlete = athleteList.get(0);
        assertEquals(11, athlete.getAthleteNumber());
        assertEquals("Umar Jorgson", athlete.getName());
        assertEquals("SK", athlete.getCountryCode());
        assertEquals("30:27", athlete.calculateFinalTime());


    }

}