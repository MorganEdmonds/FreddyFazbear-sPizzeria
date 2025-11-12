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
//        switch (name) {
//            case "pepperoni","sausage","ham","bacon","meatball":
//                if (size == "small"){
//                    price = 1.00;
//
//                }
//                else if (size == "medium") {
//                    price = 2.00;
//
//                }
//                else if (size == "Large"){
//                    price = 3.00;
//
//            }
//
//                price = 1.00;
//                break;
//
//            case "mozzarella","parmesan","ricotta","goat cheese","buffalo cheese":
//                if (size == "small"){
//                    price = .75;
//                }
//
//                else if (size == "medium") {
//                    price = 1.50;
//
//                }
//
//                else if (size == "large") {
//                    price = 3.00;
//
//                }
//
//                price = 0.75;
//                break;
//
//            case "onions", "mushrooms", "bell peppers","olives", "tomatoes", "spinach","basil","pineapple","anchovies":
//                price = 0.00;
//                break;
//            case "marinara", "alfredo", "pesto", "bbq", "buffalo", "olive oil" :
//                price = 0.00;
//                break;
//
//
//        }










    return price;
    }
}