package org.cursjava.EXTRA_EXERCITII.EnumsIO_practice.Ex1;

import org.cursjava.EXTRA_EXERCITII.EnumsIO_practice.Ex1.Exceptions.PriorityException;

import java.util.Scanner;

public class Main {
    /**
     * Cerinte:
     * Implementeaza un calculator de sarcina. Fiecare sarcina va avea un nume si o prioritate.
     * Prioritatea trebuie sa fie de tip ENUM;
     * Task trebuie sa aiba constructor pentru nume si priority;
     * In main, permite utilizatorului sa introduca sarcina de la tastatura.
     * Creeaza un obiect de tip task si afiseaza detaliile pe ecran.
     * Adauga Exceptii.
     * **/
    public static void main(String[] args) throws PriorityException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntrodu numele task-ului: ");
        String userTask = scanner.next();

        System.out.println("\nIntrdou prioritatea (LOW, MEDIUM, HIGH): ");
        String userPriority = scanner.next();

         userPriority = switch (userPriority) {
            case "LOW" -> String.valueOf(Priority.LOW);
            case "MEDIUM" -> String.valueOf(Priority.MEDIUM);
            case "HIGH" -> String.valueOf(Priority.HIGH);
            default -> throw new PriorityException();
        };

        Task task = new Task(userTask, userPriority);
        System.out.println(task);


    }
}
