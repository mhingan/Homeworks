package org.cursjava.Java_8_Homework.Exceptions;

public class PersonNotFoundException extends Exception{
    public PersonNotFoundException(String message){
        System.out.println(message);
    }
}
