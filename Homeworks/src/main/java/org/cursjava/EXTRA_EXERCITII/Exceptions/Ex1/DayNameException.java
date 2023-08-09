package org.cursjava.EXTRA_EXERCITII.Exceptions.Ex1;

public class DayNameException extends Exception{
    public DayNameException(String message){
        System.out.println("You have to provide a week day.");
    }


}
