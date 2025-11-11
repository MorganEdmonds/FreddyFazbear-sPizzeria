package com.pluralsight;

public class Topping {

    public Topping(String name, String category, boolean isExtra) {
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


    public Double getPrice(String size) {
        double price = 0.0;

        // determine what the base price is based on the topping
        switch (name) {
            case "pepperoni","sausage","ham","bacon","meatball":
                if (size == "small"){
                    price = 1.00;
                }
                else if (size == "medium") {
                    price = 2.00;

                }
                else if (size == "Large"){
                    price = 3.00;

            }

                price = 1.00;
                break;
            case "mozzarella","parmesan","ricotta","goat cheese","buffalo cheese":
                if (size == "small"){
                    price = .75;
                }

                else if (size == "medium") {
                    price = 1.50;

                }

                else if (size == "large") {
                    price = 3.00;

                }

                price = 0.75;
                break;

            case "onions", "mushrooms", "bell peppers","olives", "tomatoes", "spinach","basil","pineapple","anchovies":
                price = 0.00;
                break;
            case "marinara", "alfredo", "pesto", "bbq", "buffalo", "olive oil" :
                price = 0.00;
                break;


        }










    return price;
    }
}