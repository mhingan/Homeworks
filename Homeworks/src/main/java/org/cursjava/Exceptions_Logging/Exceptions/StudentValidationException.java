package org.cursjava.Exceptions_Logging.Exceptions;

public class StudentValidationException extends Exception {
    public StudentValidationException(String message) {
        System.out.println(message);
    }
}
