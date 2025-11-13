package com.pluralsight;

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

        System.out.println("=====Pizza Menu Options=====");

        String pizzaScreen = """
                 ====== Pizza Screen! ======
               (1) Add Pizza
               (2) Checkout
               (3) Cancel Order
                 ==================
                 """;



        System.out.println(pizzaScreen);

        int pizzaScreenChoice = InputCollector.promptForInt("Choose a command");

        switch (pizzaScreenChoice){}
    }

}