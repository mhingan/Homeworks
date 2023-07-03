package org.cursjava.Testing_Tema2;


public class Main {
    public static void main(String[] args) {
        String expression = "10 cm + 1 m - 10 mm + 6 km";
        int distance = DistanceCalculator.calculateDistance(expression);
        System.out.println("Result: " + distance + " mm");
    }
}
