package org.cursjava.EXTRA_EXERCITII.Enum.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numar = Numere.IMPAR.ordinal();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: \n");
        numar = scanner.nextInt();

        if(numar % 2 == 0){
            numar = Numere.PAR.ordinal();
            System.out.println("nr par" + numar);
        } else {
            numar = Numere.IMPAR.ordinal();
            System.out.println("nr impar" + numar);
        }
    }
}
