package org.cursjava.EXTRA_EXERCITII.Exceptions.Ex1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        dayInfo(Week.MONDAY);
    }

    public static void dayInfo(Week dayName){
        try{
            switch (dayName){
                case MONDAY -> System.out.println("Today is Monday: " + new Date());
                case TUESDAY -> System.out.println("Today is Tuesday: " + new Date());
                case WEDNESDAY -> System.out.println("Today is Wednesday: " + new Date());
                case THURSDAY -> System.out.println("Today is Thursday: " + new Date());
                case FRIDAY -> System.out.println("Today is Friday: " + new Date());
                case SATURDAY -> System.out.println("Today is Saturday: " + new Date());
                case SUNDAY -> System.out.println("Today is Sunday: " + new Date());
                default -> throw new DayNameException(dayName + ": is not a day!");
            }
        } catch (DayNameException e) {
            throw new RuntimeException(e);
        }
    }
}
