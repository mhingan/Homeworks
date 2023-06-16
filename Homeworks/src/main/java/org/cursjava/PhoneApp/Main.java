package org.cursjava.PhoneApp;

import org.cursjava.PhoneApp.Samsungs.SamsungGalaxyS23;
import org.cursjava.PhoneApp.iPhone.IPhone10;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new IPhone10(12,"grey","wood","HJD6SBWBDW9");
        phone1.addContact(674, "0754989060", "Mihai", "Hingan");
        phone1.viewContact();
        phone1.sendMessage("0754989060", "Test message");
        phone1.viewMessage("0754989060");
        phone1.getBatteryLife();
        phone1.call("0754989060");
        phone1.viewCallHistory();
        phone1.getBatteryLife();

        Phone phone2 = new SamsungGalaxyS23(21, "brown", "inox", "JDB767R83UVB");
        phone2.addContact(214, "0765329887", "Andrei", "Mariano");
        phone2.viewContact();
        phone1.sendMessage("0765329887", "Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!Acest mesaj contine mai mult de 500 de  caractere!");
        phone1.viewMessage("0765329887");
        phone1.getBatteryLife();
        phone1.call("0765329887");
        phone1.viewCallHistory();
        phone1.getBatteryLife();




    }
}
