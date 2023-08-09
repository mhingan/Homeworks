package org.cursjava.Exceptions_Logging.Exceptions;

public class NameVerificationException extends Throwable {
    public NameVerificationException(String message) {
        System.out.println(message);
    }
}
