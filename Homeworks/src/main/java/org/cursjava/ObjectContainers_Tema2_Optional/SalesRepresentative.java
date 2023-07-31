package org.cursjava.ObjectContainers_Tema2_Optional;

import org.jetbrains.annotations.NotNull;

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


}
