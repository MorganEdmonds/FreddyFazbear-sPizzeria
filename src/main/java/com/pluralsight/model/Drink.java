package com.pluralsight.model;

public class Drink extends Product {

    private String name;
    private String size;
    private double price;

//prompt user for flavor and size
// Determine the price based on the size

    public Drink(String description, String name, String size) {
        super(description);
        this.name = name;
        this.size = size;

//        switch(size){
//            case "small":
//                this.price = 2.00;
//                break;
//
//            case "medium":
//                this.price = 2.50;
//                break;
//
//            case "large":
//                this.price = 3.00;
//                break;
//
//            default:
//                this.price = 2.00;
//                break;
//
//        }
    }


//    public Drink(String name, String size, double price) {
//        this.name = name;
//        this.size = size;
//        this.price = price;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }


public double getPrice() {
    switch(size){
        case "small":
           return this.price = 2.00;

        case "medium":
           return this.price = 2.50;

        case "large":
          return this.price = 3.00;

        default:
            this.price = 2.00;
            break;

    }return price;



    }
    @Override
    public String toString(){
        return String.format("Drink - %s: | $%.2f", size, getPrice());
}
//method to set price by size of drink

//    public double setPriceBySize(){
//        double price = 0.0;
//
//        switch(size){
//            case "small":
//                this.price = 2.00;
//                break;
//
//            case "medium":
//                this.price = 2.50;
//                break;
//
//            case "large":
//                this.price = 3.00;
//                break;
//
//            default:
//            this.price = 2.00;
//            break;
//
//        }
//        return price;
//    }
















}

