package com.pluralsight;

public class Toppings {

    public Toppings(String name, String category, boolean isExtra) {
        this.name = name;
        this.category = category;
        this.isExtra = isExtra;
    }

    private String category;
    private boolean isExtra;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    public Double getPrice() {
        double price = 0.0;

        // determine what the base price is based on the topping
        switch (name) {
            case "pepperoni","sausage","ham","bacon","meatball":
                price = 1.00;
                break;
            case "mozzarella","parmesan","ricotta","goat cheese","buffalo cheese":
                price = 0.75;
                break;
//            case "onions", "mushrooms", "bell peppers","olives", "tomatoes", "spinach","basil","pineapple","anchovies":
//                price = 0.00;
//                break;
//            case "marinara", "alfredo", "pesto", "bbq", "buffalo", "olive oil" :
//                price = 0.00;
//                break;


        }










    return price;
    }
}