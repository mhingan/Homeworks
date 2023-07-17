package org.cursjava.Exceptions_Logging_Homework.Exceptions;

public class CNPException extends Exception{
    public CNPException(){
        System.out.println("No student found associated with this ID / CNP.");
    }
}
