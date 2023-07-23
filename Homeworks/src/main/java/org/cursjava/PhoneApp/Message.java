package org.cursjava.PhoneApp;

public class Message {
    String phone;
    String message;

    /**
     * Creating the constructor
     **/
    public Message(String phoneNumber, String messageContent) {
        this.message = messageContent;
        this.phone = phoneNumber;
    }

    /**
     * @toString - this method return the message that was sent to a user.
     **/
    @Override
    public String toString() {
        return phone + "\nMessage:\n" + message;
    }

    public String getPhoneNumber(){
        return phone;
    }
}
