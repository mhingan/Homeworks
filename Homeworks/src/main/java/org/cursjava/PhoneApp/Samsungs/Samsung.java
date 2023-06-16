package org.cursjava.PhoneApp.Samsungs;

import org.cursjava.PhoneApp.Contact;
import org.cursjava.PhoneApp.Message;
import org.cursjava.PhoneApp.Phone;

import java.util.ArrayList;
import java.util.List;

public class Samsung extends Phone {
    List<Contact> contacts;
    List<Message> messages;
    List<String> callHistory;

    public Samsung(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
        contacts = new ArrayList<>();
        messages = new ArrayList<>();
        callHistory = new ArrayList<>();
    }

    @Override
    public void addContact(int id, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(id, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    @Override
    public void viewContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() > 500) {
            System.err.println("Message exceeds the 500 digits limit.");
        } else if (batteryLife <= 0) {
            System.err.println("Battery life just dropped to 0. Charge the phone");
        } else {
            Message message = new Message(phoneNumber, messageContent);
            messages.add(message);
            batteryLife -= 1;
        }
    }

    @Override
    public void viewMessage(String phoneNumber) {
        if(phoneNumber.equals(phoneNumber)){
            System.out.println(messages);
        }
    }

    @Override
    public void call(String phoneNumber) {
        callHistory.add(phoneNumber);
        batteryLife -= 2;
        if(batteryLife <= 0){
            System.err.println("Battery life just dropped to 0. Charge the phone");
        }
    }


    @Override
    public void viewCallHistory() {
        for(String calls: callHistory){
            System.out.println("Calls History:" + calls);
        }
    }
}
