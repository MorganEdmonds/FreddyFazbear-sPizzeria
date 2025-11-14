package com.pluralsight.model;

public class Topping {

    private String name;
    private String category;
    private boolean isExtra;

    public Topping(String name) {
        this.name = name;
        this.category = switch(this.name) {
            case "pepperoni", "sausage", "ham", "bacon", "chicken", "meatball" -> "meat";
            case "mozzarella", "parmesan", "ricotta", "goat cheese", "buffalo" -> "cheese";
            default -> "regular";
        };
        this.isExtra = !isExtra;
    }



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
    //Todo split up extra pricing
    //todo addTopping method
    //todo remove

    // determine what the base price is based on the topping
    public double getPrice(String size) {
        double price = 0.0;

        //define pricing of toppings.
        //return price of toppings based on pizza size.
        switch (category) {
            case "meat":
                if (size.equalsIgnoreCase("8")) {
                    price = 1.00;
                } else if (size.equalsIgnoreCase("12")) {
                    price = 2.00;
                } else if (size.equalsIgnoreCase("16")) {
                    price = 3.00;
                }

                //if they want extra meat.
                if (size.equalsIgnoreCase("8")&& isExtra) {
                    price += .50;
                } else if (size.equalsIgnoreCase("12")&& isExtra) {
                    price += 1.00;
                } else if (size.equalsIgnoreCase("16")&& isExtra) {
                    price += 1.50;
                }
                break;

            case "cheese":
                if (size.equalsIgnoreCase("8")) {
                    price = .75;
                } else if (size.equalsIgnoreCase("12")) {
                    price = 1.50;
                } else if (size.equalsIgnoreCase("16")) {
                    price = 2.25;
                }

                //if they want extra cheese.
                if (size.equalsIgnoreCase("8")&& isExtra) {
                    price += .30;
                } else if (size.equalsIgnoreCase("12")&& isExtra) {
                    price += .60;
                } else if (size.equalsIgnoreCase("16")&& isExtra) {
                    price += .90;
                }
                break;
            default: price = 0;
        }


        return price;

    }
}