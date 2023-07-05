package org.cursjava.Testing_Tema2;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistanceCalculator {
    private static final Pattern COMPONENT_PATTERN = Pattern.compile("(\\d+)\\s?(\\w+)");

    private static int convertToMillimeters(int value, String unit) {
        int conversionFactor;
        switch (unit) {
            case "mm":
                conversionFactor = 1;
                break;
            case "cm":
                conversionFactor = 10;
                break;
            case "dm":
                conversionFactor = 100;
                break;
            case "m":
                conversionFactor = 1000;
                break;
            case "km":
                conversionFactor = 1000000;
                break;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + unit);
        }
        return value * conversionFactor;
    }

    private static double convertFromMillimeters(int value, String unit) {
        double conversionFactor;
        switch (unit) {
            case "mm":
                conversionFactor = 1;
                break;
            case "cm":
                conversionFactor = 0.1;
                break;
            case "dm":
                conversionFactor = 0.01;
                break;
            case "m":
                conversionFactor = 0.001;
                break;
            case "km":
                conversionFactor = 0.000001;
                break;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + unit);
        }
        return value * conversionFactor;
    }




    public static double computeDistance(String expression, String outputUnit) {
        Matcher matcher = COMPONENT_PATTERN.matcher(expression);
        int totalMillimeters = 0;

        while (matcher.find()) {
            int value = Integer.parseInt(matcher.group(1));
            String unit = matcher.group(2);
            int mmValue = convertToMillimeters(value, unit);
            totalMillimeters += mmValue;
        }

        double finalValue = convertFromMillimeters(totalMillimeters, outputUnit);
        return finalValue;
    }


}
