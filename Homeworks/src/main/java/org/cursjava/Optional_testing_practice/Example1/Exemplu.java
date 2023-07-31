package org.cursjava.Optional_testing_practice.Example1;


public class Exemplu {


    public int sumAB(int a, int b){
        return  a + b;
    }

    public boolean evenNumber(int nr){
        if(nr%2==0){
            System.out.println(nr + " is an even number.");
            return true;
        } else {
            System.err.println(nr + " is not an even number");
            return false;
        }
    }


}
