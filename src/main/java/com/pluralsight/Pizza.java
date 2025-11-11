package com.pluralsight;

import java.util.ArrayList;

public class Pizza extends Product {
        private String size;
        private String crust;
        private ArrayList<Toppings> toppings;
        private boolean isStuffed;

    public Pizza(String description, String size, String crust, boolean isStuffed) {
        super(description);
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>();
        this.isStuffed = isStuffed;
    }

    public void addTopping(Toppings t){
        toppings.add(t);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }

    public boolean isStuffed() {
        return isStuffed;
    }

    public void setStuffed(boolean stuffed) {
        isStuffed = stuffed;
    }

    

    @Override
    public double getPrice() {
        return 0;
    }
}
