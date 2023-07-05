package org.cursjava.Testing_Tema;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10 cm + 1 m, mm, 1100.0",
            "2 km + 500 m, m, 2500.0"
    })
    void computeDistance_ParameterizedTest(String expression, String outputUnit, double expected) {
        double result = DistanceCalculator.computeDistance(expression, outputUnit);
        assertEquals(expected, result);
    }

    @Test
    void computeDistance_AllOperationsTest() {
        String expression = "10 cm + 1 m";
        String outputUnit = "mm";
        double expected = 1100.0;
        double result = DistanceCalculator.computeDistance(expression, outputUnit);
        assertEquals(expected, result);
    }
}