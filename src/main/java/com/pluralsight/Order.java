package com.pluralsight;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
        private ArrayList<Product> products;
        private LocalDateTime date;

    public Order(ArrayList<Product> products, LocalDateTime localDateTime) {
        this.products = products;
        this.date = localDateTime;
    }

    public Order() {
        this.products = new ArrayList<>();
        this.date = LocalDateTime.now();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public LocalDateTime getLocalDateTime() {
        return date;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.date = localDateTime;
    }





    public String getOrderDetails(){
        StringBuilder builder = new StringBuilder();
        builder.append("Freddy Fazbear's Pizzeria");
        builder.append("\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formatterDateTime = date.format(formatter);
        builder.append(" Date and Time :" + formatterDateTime);

        builder.append("\n");
        builder.append("----------------");
        builder.append("\n");

        for(Product p : products){
            builder.append(p.getDescription()+"\n");
            builder.append(" Price: $ " + String.format("%.2f", p.getPrice() + "\n"));

            builder.append("\n");
            builder.append("----------------");
            builder.append("\n");
        }
        builder.append("Total: $");
        builder.append( String.format("%.2f", calculateTotal()) );
        return builder.toString();
    }

    public void addProduct(Product product){
        products.add(product);


    }

    public double calculateTotal(){

      return products.stream().mapToDouble(products-> products.getPrice()).sum();
    }

//    public boolean isValidOrder(){
//        /*A customer can place an order with 0 or more pizzas on the order, If a customer
//        places an order with 0 pizzas, they must purchase garlic knots or a drink.*/
//        boolean hasPizza = products.stream().anyMatch(product -> product instanceof Pizza);
//
//        if(!hasPizza){
//
//                for(Product p : products ){
//                    if (p instanceof Garlicknot || p instanceof Drink){
//
//                        return true;
//                    }
//
//                }
//
//
//        }else {
//            return false;
//        }
//
//        return hasPizza;
//
//    }


    // User will be able to create a pizza with the option of different crusts as well as premium toppings
    //User will be able to add garlic knots
    //User will be able to add drink
}
