package org.cursjava.PhoneApp;

public class Message {
    String phone;
    String message;
    public Message(String phoneNumber, String messageContent) {
        this.message = messageContent;
        this.phone = phoneNumber;
    }

    @Override
    public String toString() {
        return phone + "\nMessage:\n" + message;
    }
}
