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
            case "pepperoni":
                price = 1.00;
                break;

            case "sausage":
                price = 1.00;
                break;

            case "ham":
                price = 1.00;
                break;

            case "bacon":
                price = 1.00;
                break;

            case "meatball":
                price = 1.00;
                break;

        }


        switch (name){
            case "mozzarella":
                price = 0.75;
                break;

            case "parmesan":
                price = 0.75;
                break;

            case "ricotta":
                price = 0.75;
                break;

            case "goat cheese":
                price = 0.75;
                break;

            case "buffalo":
                price = 0.75;
                break;
        }

        switch (name){
            case "onions":
                price = 0.00;
                break;

            case "mushrooms":
                price = 0.00;
                break;

            case "bell peppers":
                price = 0.00;
                break;

            case "olives":
                price = 0.00;
                break;

            case "tomatoes":
                price = 0.00;
                break;

            case "spinach":
                price = 0.00;
                break;

            case "basil":
                price = 0.00;
                break;

            case "pineapple":
                price = 0.00;
                break;

            case "anchovies":
                price = 0.00;
                break;
        }


        switch (name){
            case "marinara":
                price = 0.00;
                break;

            case "alfredo":
                price = 0.00;
                break;

            case "pesto":
                price = 0.00;
                break;

            case "bbq":
                price = 0.00;
                break;

            case "buffalo":
                price = 0.00;
                break;

            case "olive oil":
                price = 0.00;
                break;
        }


        switch (name){
            case "red pepper":
                price = 0.00;
                break;

            case "parmesan":
                price = 0.00;
                break;
        }
    return price;
    }
}