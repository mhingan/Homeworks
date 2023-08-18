package org.cursjava.IO_Enums_Homework;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiathlonFileReaderTest {


    @Test
    public void test_athlete_List_Size_and_athlete_Info_success() throws IOException {
        String csvData = "src/main/resources/csvData.txt";

        List<Athlete> athleteList = BiathlonFileReader.readCSVFile(csvData);
        assertEquals(3, athleteList.size());

        Athlete athlete = athleteList.get(0);
        assertEquals(11, athlete.getAthleteNumber());
        assertEquals("Jimmy Smiles", athlete.getName());
        assertEquals("UK", athlete.getCountryCode());



    }

}