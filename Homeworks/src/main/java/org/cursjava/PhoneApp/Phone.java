package org.cursjava.PhoneApp;

public abstract class Phone {
    protected int batteryLife;
    protected String color;
    protected String material;
    protected String IMEI;

    public Phone(int batteryLife, String color, String material, String IMEI){
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }


    public abstract void addContact(int id, String phoneNumber, String firstName, String lastName);
    public abstract void viewContact();
    public abstract void sendMessage(String phoneNumber, String messageContent);
    public abstract void viewMessage(String phoneNumber);
    public abstract void call(String phoneNumber);
    public abstract void viewCallHistory();

    public void getBatteryLife() {
        System.out.println("New battery life: " + batteryLife);
    }

}
