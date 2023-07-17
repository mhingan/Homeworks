package org.cursjava.EXTRA_EXERCITII.Exceptions.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkId();
    }


    public static void checkId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert ID to enter the club: \n");
        String userId = scanner.next();

        try{
            if(userId.startsWith("1") || userId.startsWith("2")){
                throw new IdVerificationException("You are a minor! You must be at least 18 years old!");
            } else if (userId.startsWith("8") || userId.startsWith("9")) {
                throw new IdVerificationException("You are too old! You must be under 80 to get in.");
            } else if (userId.startsWith("0")) {
                throw new NullPointerException();
            } else if (containsCharacters(userId)) {
                throw new IdVerificationException("Characters are not allowed in ID field.");
            } else {
                System.out.println("Welcome to the club!");
            }
        } catch (IdVerificationException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean containsCharacters(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
}
