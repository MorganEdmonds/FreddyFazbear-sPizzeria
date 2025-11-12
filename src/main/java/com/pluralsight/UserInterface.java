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
            int welcomeScreenChoice = InputCollector.promptForInt("");


            switch (welcomeScreenChoice) {
                case 0:
                    return;
                case 1:
                    //display order screen
                    processNewOrderRequest(orderScreenWithInput());

            }
        }
    }

    public int orderScreenWithInput(){

        int orderScreenChoice = InputCollector.promptForInt(
                """
               ====== Order Screen! ======)
               (1) Add Pizza )
               (2) Add Garlic knots);
               (3) Add Drink );
               (4) Check out);
               (5) Cancel Order);
               (=======================""");

             return orderScreenChoice;



    }
    public void processNewOrderRequest(int orderScreenChoice) {
        Order order = new Order();

    }

}