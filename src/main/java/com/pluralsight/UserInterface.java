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
                addPizza(order);
                break;
            case 2:
                addGarlicKnotsScreen(order);
                break;
            case 3:
                addDrinkScreen(order);
                break;
            case 4:
                checkOutScreen(order);
                break;
            case 5:
                cancelOrder(order);
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


    }

    private void addDrinkScreen(Order order) {

        System.out.println("==============");
        System.out.println("    DRINK OPTION    ");
        System.out.println("==============");

        String drinkName = InputCollector.promptForString("What drink flavor would you like?");
        System.out.println("Drink flavors: freddy’s fruity fizz, chica’s clucking cola, foxy’s pirate pineapple, bonnie’s blueberry blast" );

        String drinkSize = InputCollector.promptForString("What drink size would you like");
        System.out.println("Size options: small, medium, large");

        Drink drink = new Drink("", drinkName, drinkSize);

        order.addProduct(drink);




    }

    private void addPizza(Order order) {
        //1 Display Heading that says Pizza Builder
        System.out.println("==============");
        System.out.println("    PIZZA BUILDER    ");
        System.out.println("==============");


        //2 Ask User what crust type they want
        System.out.println("Crust Options : thin ,regular , thick, cauliflower");
        String crustType = InputCollector.promptForString("What crust would you like?");


        //3 ask user what pizza size they want
        System.out.println("Pizza size options : 8 in , 12 in , 16 in ");
        String pizzaSize = InputCollector.promptForString("What size pizza would you like?");


        //4 ask user what meat toppings they want
        //TODO create an array list of meat toppings and a while loop to allow the user to go through topping options.
        ArrayList<Topping> toppings = new ArrayList<>();
        //display meat options
        System.out.println("pepperoni, sausage, ham, bacon, chicken, meatball");
        //ask which meat topping they want with input collector
        String meatTopping = InputCollector.promptForString("What type of meat topping would you like?");

        //assign the string to a new topping (make a new topping)
        Topping toppingMeat = new Topping(meatTopping,"meat", false);

        //add to our arraylist named toppings
        toppings.add(toppingMeat);

        //5 ask user what cheese topping they want
        System.out.println("Mozzarella, Parmesan, Ricotta, Goat, Cheese, Buffalo");
        //TODO make array list of cheese toppings
        String cheeseTopping = InputCollector.promptForString("What type of cheese topping would you like?");
        Topping toppingCheese = new Topping(cheeseTopping,"cheese",false);

        toppings.add(toppingCheese);

        //6 ask user what other toppings they want
        System.out.println(" onions, mushrooms,bell peppers,olives,tomatoes,spinach, basil, pineapple,anchovies ");
        String regularTopping = InputCollector.promptForString("What veggie topping would you like?");
        Topping toppingRegular = new Topping(regularTopping,"veggie",false);

        toppings.add(toppingRegular);

        //7 ask user what select sauces they want
        System.out.println(" marinara, alfredo, pesto, bbq, buffalo, olive oil ");
        String sauceTopping = InputCollector.promptForString("What type of sauce would you like?");
        //TODO make array list of sauce toppings
        Topping toppingSauce = new Topping(sauceTopping,"sauce", false);
        toppings.add(toppingSauce);


        //8 ask user if they would like stuffed crust
        String answer = InputCollector.promptForString("would you like stuffed crust?(Y/N)");

        boolean stuffedCrust = answer.equalsIgnoreCase("Y");

        Pizza pizza = new Pizza("",pizzaSize,crustType,stuffedCrust);

        pizza.setToppings(toppings);

        order.addProduct(pizza);








        //9 making pizza based on user input






    }

}