package org.cursjava.Testing_Tema;


import static org.cursjava.Testing_Tema.DistanceCalculator.computeDistance;

public class Main {
    public static void main(String[] args) {
        String expression = "10 cm + 1 m";
        String outputUnit = "mm";
        double result = computeDistance(expression, outputUnit);
        System.out.println(result);  // Output: 1090.0 mm
    }
}
