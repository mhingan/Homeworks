package org.cursjava.PhoneApp;

import org.cursjava.PhoneApp.Samsungs.SamsungGalaxyS20;
import org.cursjava.PhoneApp.Samsungs.SamsungGalaxyS23;
import org.cursjava.PhoneApp.iPhone.IPhone10;
import org.cursjava.PhoneApp.iPhone.IPhone13;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPHONE 1:");
        Phone phone1 = new IPhone10(12, "Grey", "Wood", "HJD6SBWBDW9");
        phone1.addContact(6744, "0754989060", "Mihai", "Hingan");
        phone1.viewContact();
        phone1.sendMessage("0754989060", "Test message");
        phone1.viewMessage("0754989060");
        phone1.getBatteryLife();
        phone1.call("0754989060");
        phone1.viewCallHistory();


        System.out.println("\nPHONE 2:");
        Phone phone2 = new SamsungGalaxyS23(21, "Brown", "Inox", "JDB767R83UVB");
        phone2.addContact(2164, "0765329887", "Andrei", "Mariano");
        phone2.viewContact();
        phone1.sendMessage("0765329887", "Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!");
        phone1.getBatteryLife();
        phone1.call("0765329887");
        phone1.viewCallHistory();


        System.out.println("\nPHONE 3:");
        Phone phone3 = new IPhone13(19, "White", "Aluminium", "YGUBC65C4738NX");
        phone3.addContact(6486, "0789444213", "Mihaela", "Nic");
        phone3.viewContact();
        phone3.sendMessage("0789444213", "Hello World!");
        phone3.viewMessage("0789444213");
        phone3.getBatteryLife();
        phone3.call("0789444213");
        phone3.viewCallHistory();


        System.out.println("\nPHONE 4:");
        Phone phone4 = new SamsungGalaxyS20(8, "Black", "Plastic", "VTGF6G4G6FFB");
        phone4.addContact(4301, "0754888333", "Ana", "Vlad");
        phone4.call("0789444213");
        phone4.call("0779363737");
        phone4.call("0846358399");
        phone4.call("0764738238");
        phone4.call("0767392668");
        phone4.viewCallHistory();




    }
}
