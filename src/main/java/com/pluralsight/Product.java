package com.pluralsight;

public abstract class Product {
    protected String description;

    public Product(String description) {
        this.description = description ;

    }

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();



    @Override
    public String toString() {
        return String.format("%s | $%.2f", description);
    }
}
