package org.cursjava.Testing_Tema2;


import static org.cursjava.Testing_Tema2.DistanceCalculator.computeDistance;

public class Main {
    public static void main(String[] args) {
        String expression = "10 cm + 1 m - 10 mm ";
        String outputUnit = "mm";
        double result = computeDistance(expression, outputUnit);
        System.out.println(result);  // Output: 1090.0 mm
    }
}
