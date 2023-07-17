package org.cursjava.Exceptions_Logging_Homework.Exceptions;

import org.cursjava.PhoneApp.Message;

public class AgeFormatException extends Exception{
    public AgeFormatException(Message message){
        System.out.println("Age is negative | Age is not a number.");
    }
}
