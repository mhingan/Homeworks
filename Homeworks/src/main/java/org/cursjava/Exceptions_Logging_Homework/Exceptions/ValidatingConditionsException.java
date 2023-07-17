package org.cursjava.Exceptions_Logging_Homework.Exceptions;

import org.cursjava.PhoneApp.Message;

public class ValidatingConditionsException extends Exception {
    public ValidatingConditionsException(){
        System.out.println("Validation error: Student with this ID/CNP already exists.");
    }

}
