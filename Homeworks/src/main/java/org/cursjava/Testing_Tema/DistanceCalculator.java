package org.cursjava.Testing_Tema;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistanceCalculator {
    private static final Pattern COMPONENT_PATTERN = Pattern.compile("(\\d+)\\s?(\\w+)");

    private static int convertToMillimeters(int value, String unit) {
        int conversionFactor = switch (unit) {
            case "mm" -> 1;
            case "cm" -> 10;
            case "dm" -> 100;
            case "m" -> 1000;
            case "km" -> 1000000;
            default -> throw new IllegalArgumentException("Unsupported unit: " + unit);
        };
        return value * conversionFactor;
    }

    private static double convertFromMillimeters(int value, String unit) {
        double conversionFactor = switch (unit) {
            case "mm" -> 1;
            case "cm" -> 0.1;
            case "dm" -> 0.01;
            case "m" -> 0.001;
            case "km" -> 0.000001;
            default -> throw new IllegalArgumentException("Unsupported unit: " + unit);
        };
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
