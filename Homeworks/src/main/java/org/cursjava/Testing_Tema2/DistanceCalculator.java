package org.cursjava.Testing_Tema2;

import org.jetbrains.annotations.NotNull;

public class DistanceCalculator {
    public static int calculateDistance(@NotNull String expression) {
        String[] terms = expression.split("\\s+");

        int result = 0;
        int operator = 1;
        for (String term : terms) {
            if (term.isEmpty()) {
                continue;
            } else if (term.equals("+")) {
                operator = 1;
                continue;
            } else if (term.equals("-")) {
                operator = -1;
                continue;
            }

            int value;
            if (term.matches(".*\\d+.*")) {
                value = Integer.parseInt(term.replaceAll("[^0-9-]", ""));
            } else {
                continue;
            }
            String unit = term.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (unit.isEmpty()) {
                continue;
            }
            int conversionFactor = getConversionFactor(unit);
            result += operator * (value * conversionFactor);
        }
        return result;
    }





    private static int getConversionFactor(String unit) {
        if (unit.isEmpty()) {
            throw new IllegalArgumentException("Invalid unit: empty string");
        }

        return switch (unit) {
            case "mm" -> 1;
            case "cm" -> 10;
            case "dm" -> 100;
            case "m" -> 1000;
            case "km" -> 1000000;
            default -> throw new IllegalArgumentException("Unsupported unit: " + unit);
        };
    }


}
