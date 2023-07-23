package org.cursjava.PhoneApp.Samsungs;

import org.cursjava.PhoneApp.Contact;
import org.cursjava.PhoneApp.Message;
import org.cursjava.PhoneApp.Phone;

import java.util.ArrayList;
import java.util.List;

public class Samsung extends Phone {
    /** @param batteryLife - indicates the battery life of the phone;
     * @param color - indicates the color of the phone;
     * @param material - indicates the material of the phone;
     * @param IMEI - represent the "International Mobile Equipment Identity";
     * **/

    /**
     * Creating 3 lists;
     * Each list has a ".java" file assigned in this project, those lists are made exclusively for contacts, messages and calls history.
     **/
    List<Contact> contacts;
    List<Message> messages;
    List<String> callHistory;

    /**
     * @Samsung - is the class that extends the parent class Phone;
     * Creating the constructor for Samsung class;
     **/
    public Samsung(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
        contacts = new ArrayList<>();
        messages = new ArrayList<>();
        callHistory = new ArrayList<>();
    }

    /**
     * @addContact - this method is used in order to add a new contact in a list;
     * A new Contact object is initialized in order to be able to add a new person to the contact list.
     * <p>
     * - example of use: phone.addContact(328, "097454546", "Marius", "Andrei");
     **/
    @Override
    public void addContact(int id, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(id, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    /**
     * @viewContact - is the method that returns a contact that was added on a specific phone.
     * - this method returns: name, phone number, id;
     * <p>
     * - example of use: "phone.viewContact()"
     **/
    @Override
    public void viewContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    /**
     * @sendMessage - using this method a new message will be sent to a user. If the message is longer than 500 digits, we throw an exception.
     * Also, each time a message is sent, 1 hours from the battery life is taken.
     * <p>
     * - example of use: "phone.sendMessage(07443565436, "Hello World!)"
     **/
    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() > 500) {
            System.out.println("Message exceeds the 500 digits limit.");
        } else if (batteryLife <= 0) {
            System.out.println("Battery life just dropped to 0. Charge the phone");
        } else {
            Message message = new Message(phoneNumber, messageContent);
            messages.add(message);
            batteryLife -= 1;
        }
    }

    /**
     * @viewMessage - is returning the message that was sent.
     * <p>
     * - example of use: "phone.viewMessage(074567346)"
     **/
    @Override
    public void viewMessage(String phoneNumber) {
        for(Message message:messages){
            if(message.getPhoneNumber().equals(phoneNumber)){
                System.out.println(message);
            }
        }
    }

    /**
     * @call - using this method you can call a phone number, each time a phone call is made, 2 hours from the battery life are taken.
     * <p>
     * - example of use: "phone.call(07443565436)"
     **/
    @Override
    public void call(String phoneNumber) {
        callHistory.add(phoneNumber);
        batteryLife -= 2;
        if (batteryLife <= 0) {
            System.out.println("Battery life just dropped to 0. Charge the phone");
        }
    }

    /**
     * @viewCallHistory - using this method you can see all the phone numbers that were called from a specific phone;
     * <p>
     * - example of use: "phone.viewCallHistory()"
     **/
    @Override
    public void viewCallHistory() {
        for (String calls : callHistory) {
            System.out.println("Calls History:" + calls);
        }
    }
}
