package com.pluralsight;

public class Garlicknot extends Product {


    public Garlicknot(String description) {
        super(description);
    }



        @Override
    public double getPrice() {
       // return price();
        return 1.50;
    }
}
