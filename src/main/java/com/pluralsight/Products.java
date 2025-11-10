package com.pluralsight;

public abstract class Products {
    protected String size = "S, M, L";
    protected double price;

    public Products(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return String.format("%s | $%.2f", size, price);
    }
}
