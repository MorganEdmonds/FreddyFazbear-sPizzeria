package com.pluralsight;

public class Topping extends Product {

    private String category;
    private boolean isExtra;


    public Topping(String description, String category, boolean isExtra) {
        super(description);
        this.category = category;
        this.isExtra = isExtra;

    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
        //Todo split up extra pricing
    //todo addTopping method
    //todo remove

    // determine what the base price is based on the topping
    public double getPrice() {
        double price = 0.0;
        double extraPrice = 0;

        //Use if and else statements to loop through topping options.
        //return price of toppings based on pizza size.
            if(isExtra){

            }

    return price;
    }
}