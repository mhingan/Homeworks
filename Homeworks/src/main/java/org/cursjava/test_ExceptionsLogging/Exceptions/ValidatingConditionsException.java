package org.cursjava.test_ExceptionsLogging.Exceptions;

public class ValidatingConditionsException extends Exception {
    public ValidatingConditionsException(){
        System.out.println("Validation error: Student with this ID/CNP already exists.");
    }

}
