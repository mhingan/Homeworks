package org.cursjava.EXTRA_EXERCITII.EnumsIO_practice.Ex1.Exceptions;

public class PriorityException extends Exception{
    public PriorityException(){
        System.out.println("Incorrect statement: You have to use teh following: LOW, MEDIUM, HIGH. ^");
    }
}
