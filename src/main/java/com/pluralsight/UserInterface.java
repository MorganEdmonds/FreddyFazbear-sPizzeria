package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {


    //Create welcome screen.
    public void welcomeScreen(){
        System.out.println("\n====== Welcome to Freddy Fazbear's pizza! ======");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.println("=======================");
    }

    //todo add pizza method, add drink method, add garlic knots method
    //todo create welcome screen and homescreen
    //todo figure out how to display toppings and handle meats and cheese


    public void display(){

        while (true){
            welcomeScreen();
            int welcomeScreenChoice = InputCollector.promptForInt("Enter a Command");

            switch (welcomeScreenChoice) {
                case 0:
                    return;
                case 1:
                    //display order screen
                    orderScreenWithInput();

            }
        }
    }

    public int orderScreenWithInput(){

        Order order = new Order();

        String orderScreen = """
                 ====== Order Screen! ======
               (1) Add Pizza
               (2) Add Garlic Knots
               (3) Add Drink
               (4) Checkout
               (5) Cancel Order
               ======================
                """;

        System.out.println(orderScreen);

        int orderScreenChoice = InputCollector.promptForInt("Choose a command");

        switch (orderScreenChoice){

            case 1:
                addPizza();
                break;
            case 2:
                addGarlicKnotsScreen();
                break;
            case 3:
                addDrinkScreen();
                break;
            case 4:
                checkOutScreen();
                break;
            case 5:
                cancelOrder();
            default:
                System.out.println("invalid input!");
                




        }


             return orderScreenChoice;//todo might not need

    }

    private void cancelOrder() {

        System.out.println("===== Cancel Order Screen =====");

        String cancelOrderScreen = """
                 ====== Check Out ! ======
               (3 Cancel Order
               ===============
               """;


        System.out.println(cancelOrderScreen);

        int cancelOrderScreenChoice = InputCollector.promptForInt("Choose a command");

        switch (cancelOrderScreenChoice){}
    }

    private void checkOutScreen() {

        System.out.println("===== Check Out Screen =====");

        String checkOutScreen = """
                 ====== Check Out ! ======
               (1 Checkout
               (2 Cancel Order
               =================
               """;

        System.out.println(checkOutScreen);

        int checkOutScreenChoice = InputCollector.promptForInt("Choose a command");

        switch (checkOutScreenChoice){}

    }



    //ORDER SCREEN OPTIONS.
    private void addGarlicKnotsScreen() {

        System.out.println("===== Garlic Knots Screen =====");

        String garlicKnotsScreen = """
                 ====== Garlic Knots! ======
               (1 Add Garlic Knots
               (2 Checkout
               (3 Cancel Order
                ======================
               """;

        System.out.println(garlicKnotsScreen);

        int garlicKnotsScreenChoice = InputCollector.promptForInt("Choose a command");

        switch (garlicKnotsScreenChoice){}
    }

    private void addDrinkScreen() {

        System.out.println("===== Drinks Screen =====");

        String drinksScreen = """
                 ====== Drinks! ======
               (1 Add Drinks
               (2 Checkout
               (3 Cancel Order
                ======================
               """;

        System.out.println(drinksScreen);

        int drinksScreenChoice = InputCollector.promptForInt("Choose a command");

        switch (drinksScreenChoice){}


    }

    private void addPizza() {
        //1 Display Heading that says Pizza Builder

        //2 Ask User what crust type they want
        System.out.println("Crust Options : thin ,regular , thick, cauliflower");
        String crustType = InputCollector.promptForString("What crust would you like?");

        //3 ask user what pizza size they want
        System.out.println("Pizza size options : 8 in , 12 in , 16 in ");
        String pizzaSize = InputCollector.promptForString("What size pizza would you like?");

        //4 ask user what meat toppings they want
        //TODO create an array list of meat toppings and a while loop to allow the user to go through topping options.
        ArrayList<Topping> toppings;
        //5 ask user what cheese topping they want
        //TODO make array lis of cheese toppings
        //6 ask user what other toppings they want
        //7 ask user what select sauces they want
        //TODO make array list of sauce toppings
        //8 ask user if they would like stuffed crust
        boolean stuffedCrust = InputCollector.
        //9 making pizza based on user input




    }

}