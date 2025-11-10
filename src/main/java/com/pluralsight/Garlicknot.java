package com.pluralsight;

public class Garlicknot extends Product {


    public Garlicknot(String description, double price) {
        super(description, price);
        this.price = 1.50;
    }




    @Override
    public double getPrice() {
       // return price();
        //todo fix this
        return 0;
    }
}
