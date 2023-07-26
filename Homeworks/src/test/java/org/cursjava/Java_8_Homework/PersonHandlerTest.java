package org.cursjava.Java_8_Homework;

import org.cursjava.Java_8_Homework.Exceptions.PersonNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PersonHandlerTest {

    private static final String TEST_INPUT_FILE = "src/main/resources/Java8/TestPersons.txt";
    private static final String TEST_OUTPUT_FILE = "src/main/resources/Java8/TestPersonsWithAge.txt";

    private PersonHandler personHandler;

    @BeforeEach
    public void setUp() {
        personHandler = new PersonHandler();
    }

    @Test
    public void testGetPersonsWithAge() throws IOException, PersonNotFoundException {
        // Prepare test data
        String testData = "John,Doe,15.05.1995\n" +
                "Jane,Smith,22.08.1985\n" +
                "Michael,Jordan,05.11.1990\n" +
                "Alice,Johnson,20.03.1995\n" +
                "Bob,Williams,10.02.1980";
        Files.write(Paths.get(TEST_INPUT_FILE), testData.getBytes());

        // Execute the method under test
        personHandler.getPersonsWithAge(TEST_INPUT_FILE, TEST_OUTPUT_FILE, 30);

        // Read the output file and check the contents
        List<String> outputLines = Files.readAllLines(Paths.get(TEST_OUTPUT_FILE));
        Assertions.assertEquals(2, outputLines.size());
        Assertions.assertEquals("Jane Smith", outputLines.get(0));
        Assertions.assertEquals("Bob Williams", outputLines.get(1));

        // Clean up
        Files.delete(Paths.get(TEST_INPUT_FILE));
        Files.delete(Paths.get(TEST_OUTPUT_FILE));
    }

    @Test
    public void testGetPersonsWithAge_NoPersonFound() {
        String testData = "";
        try {
            Files.write(Paths.get(TEST_INPUT_FILE), testData.getBytes());

            // Execute the method under test and expect a PersonNotFoundException
            Assertions.assertThrows(PersonNotFoundException.class, () -> {
                personHandler.getPersonsWithAge(TEST_INPUT_FILE, TEST_OUTPUT_FILE, 25);
            });

        } catch (IOException e) {
            Assertions.fail("IOException occurred while preparing test data.");
        } finally {
            // Clean up
            try {
                Files.delete(Paths.get(TEST_INPUT_FILE));
            } catch (IOException e) {
                Assertions.fail("IOException occurred while cleaning up test data.");
            }
        }
    }
}
