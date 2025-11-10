package com.pluralsight;

public abstract class Product {
    protected String description;
    protected double price;

    public Product(String description, double price) {
        this.description = description ;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();



    @Override
    public String toString() {
        return String.format("%s | $%.2f", description, price);
    }
}
