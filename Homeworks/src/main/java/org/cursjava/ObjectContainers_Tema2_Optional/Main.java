package org.cursjava.ObjectContainers_Tema2_Optional;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * Creating the List of Sales Representative;
         * Also, create 4 new SalesRepresentative object with name, numberOfSales, quota and worthOfSales;
         * **/
        List<SalesRepresentative> salesRepresentativeList = new ArrayList<>();
        SalesRepresentative representative1 = new SalesRepresentative("Andrei", 9, 450, 4500);
        SalesRepresentative representative2 = new SalesRepresentative("Maria", 8, 550, 4400);
        SalesRepresentative representative3 = new SalesRepresentative("Alex", 12, 600, 7200);
        SalesRepresentative representative4 = new SalesRepresentative("Elena", 6, 700, 4200);

        /**
         * Adding the SalesRepresentative object tot the list;
         * **/
        salesRepresentativeList.add(representative1);
        salesRepresentativeList.add(representative2);
        salesRepresentativeList.add(representative3);
        salesRepresentativeList.add(representative4);


        /**
         * Return the unsorted list;
         * **/
        System.out.println("Unsorted list: ");
        for (SalesRepresentative representative : salesRepresentativeList) {
            System.out.println(representative.getWorthOfSales() + " - " + representative.getName());
        }

        /**
         *Calling @BubbleSort();
         * **/
        SalesRepresentative.bubbleSort(salesRepresentativeList);

        /**
         *Return the sorted list;
         * **/
        System.out.println("\nSorted list: ");
        for (SalesRepresentative representative : salesRepresentativeList) {
            System.out.println(representative.getWorthOfSales() + " - " + representative.getName());
        }


    }


}
