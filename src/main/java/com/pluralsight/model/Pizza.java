package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product {
        private String size;
        private String crust;
        private List<Topping> toppings;
        private boolean isStuffed;

    public Pizza( String size, String crust, boolean isStuffed) {
        super("Pizza");
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>();
        this.isStuffed = false;
    }

    public void addTopping(Topping t){
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

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {

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
        double basePrice = 0;

        switch(size.toLowerCase()){
            case "8":
                basePrice = 8.50;
                break;
            case "12":
                basePrice = 12.00;
                break;
            case "16":
                basePrice = 16.50;
        }
        for(Topping t:toppings){
          basePrice += t.getPrice(this.size);
        }

        return basePrice;





    }

    @Override
    public String toString() {
        return "Pizza - Size: " +
                size + " |  Crust: " +
                crust +
                " | Toppings: " + toppings.toString() +
                " | " + getPrice();
    }
}
