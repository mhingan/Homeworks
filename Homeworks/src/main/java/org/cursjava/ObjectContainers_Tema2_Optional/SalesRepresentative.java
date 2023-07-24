package org.cursjava.ObjectContainers_Tema2_Optional;


import java.util.List;

public class SalesRepresentative {
    /**
     * Creating the Sales representative class and create the following variables: name, numberOfSales, quota, worthOfSales;
     **/
    private String name;
    private int numberOfSales;
    private int quota;
    private int worthOfSales;


    /**
     * Creating the constructor for Sales representative class;
     **/
    public SalesRepresentative(String name, int numberOfSales, int quota, int worthOfSales) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.worthOfSales = worthOfSales;
    }

    /**
     * Generating the getters for name, numberOfSales and worthOfSales;
     **/
    public String getName() {
        return name;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public int getQuota() {
        return quota;
    }

    public int getWorthOfSales() {
        return worthOfSales;
    }
    /**
     * @BubbleSort - this method is used to sort the element of the above list by @worthOfSales;
     **/
    //Creating a method called bubbleSort. As a entry parameter we provide the List of SalesRepresentative, using this method we sort descending the list;
    public static void bubbleSort(List<SalesRepresentative> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                SalesRepresentative current = list.get(j);
                SalesRepresentative next = list.get(j + 1);

                // "<" indica daca vrem sa afisam crescator sau descrescator lista;
                if (current.getWorthOfSales() < next.getWorthOfSales()) {
                    list.set(j, next);
                    list.set(j + 1, current);
                    swapped = true;
                }
            }
            //swapped == false;
            if (!swapped) {
                break;
            }
        }


    }
}
