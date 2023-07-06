package org.cursjava.Optional_testing_practice.Example2;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.List;

public class CarMercedes {
    private String model;
    private Color color;
    private int price;
    private boolean isSUV;

    public CarMercedes(String model, Color color, boolean isSUV) {
        this.model = model;
        this.color = color;
        this.isSUV = isSUV;
    }

    //calculeaza pretul in functie de culoare, si is suv
    public int calculateCarPrice() {
        if (isSUV) {
            return price = 20000;
        } else {
            return price = 15000;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
