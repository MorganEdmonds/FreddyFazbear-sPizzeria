package com.pluralsight.model;

public class Garlicknot extends Product {

     private String name;

    public Garlicknot(String description, String name) {
        super(description);
        this.name = name;
    }

    @Override
    public double getPrice() {
       // return price();
        return 1.50;
    }
}
