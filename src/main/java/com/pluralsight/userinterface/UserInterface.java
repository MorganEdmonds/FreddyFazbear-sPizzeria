package com.pluralsight.userinterface;

import com.pluralsight.data.OrderManager;
import com.pluralsight.data.ReceiptWriter;
import com.pluralsight.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        OrderManager orderManager = new OrderManager();
        orderManager.startNewOrder();
        Order order = orderManager.getCurrentOrder();

       // Order order = new Order();


        while(true){
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
                    //todo showing as invalid
                    orderManager.cancelOrder();
                    System.out.println("Order canceled!");
                default:
                    System.out.println("invalid input!");

            }
        }



    }

    private void checkOutScreen(Order order) {
        System.out.println(order.getOrderDetails());
    }


//todo fix isOrderValid method in Order class

//    private void checkOutScreen(Order order) {
//        ReceiptWriter receiptWriter = new ReceiptWriter();
//        //check if order is valid
//        if (order.isOrderValid()){
//            System.out.println(order.getOrderDetails());
//
//        }else{
//            System.out.println("invalid order, please try again");
//        }
//
//        String confirmOrCancel = InputCollector.promptForString("Would you like to confirm or cancel your order? (y/n)");
//
//        if (confirmOrCancel.equalsIgnoreCase("Y")){
//            receiptWriter.saveReceipt(order);
//            System.out.println("order is confirmed, saving to receipt");
//
//        }else if (confirmOrCancel.equalsIgnoreCase("N")){
//            System.out.println("Order cancelled returning to home");
//        }else{
//            System.out.println("Invalid entry, please try again");
//        }
//
//
//    }



    //ORDER SCREEN OPTIONS.
    private void addGarlicKnotsScreen(Order order) {
        System.out.println("==============");
        System.out.println("    GARLIC KNOTS   ");
        System.out.println("==============");

        String answer = InputCollector.promptForString("would you like Garlic Knots?(Y/N)");

        boolean garlicKnot = answer.equalsIgnoreCase("Y");

            Garlicknot garlicknot = new Garlicknot("6 pack","GarlicKnots");

        order.addProduct(garlicknot);
    }//todo tell user if it added properly

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




    } //todo display options 1st then ask what they want

    private void addPizza(Order order) {
        //1 Display Heading that says Pizza Builder
        System.out.println("==============");
        System.out.println("    PIZZA BUILDER    ");
        System.out.println("==============");


        //2 Ask User what crust type they want
        List<Integer> crustList = Arrays.asList(1, 2, 3, 4);
        System.out.println("Crust Options:\n1) Thin\n2) Regular\n3) Thick\n4) Cauliflower\n");

        int customerCrustChoice;

        while (true) {
            customerCrustChoice = InputCollector.promptForInt("What crust would you like?");

            if (crustList.contains(customerCrustChoice)) {
                break;
            } else {
                System.out.println("Invalid bread type. Please choose from the crust options listed.");
            }
        }
        String crustChosen = switch (customerCrustChoice) {
            case 1 -> "Thin";
            case 2 -> "Regular";
            case 3 -> "Thick";
            case 4 -> "Cauliflower";
            default -> "Error";
        };


        //3 ask user what pizza size they want
        List<Integer> pizzaSizeList = Arrays.asList(1,2,3);
        System.out.println("Pizza size Options:\n1) 8\n2) 12\n3) 16");

        int customerPizzaSizeChoice;

        while (true) {
            customerPizzaSizeChoice = InputCollector.promptForInt("What size pizza would you like?");

            if (pizzaSizeList.contains(customerPizzaSizeChoice)) {
                break;
            } else {
                System.out.println("Invalid pizza size type. Please choose from the crust options listed.");
            }
        }
        String pizzaSizeChosen = switch (customerPizzaSizeChoice) {
            case 1 -> "8";
            case 2 -> "12";
            case 3 -> "16";
            default -> "Error";
        };

        //4 ask user what meat toppings they want

        List<Integer> meatList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Crust Options:\n1) Pepperoni\n2) Sau\n3) Thick\n4) Cauliflower\n5) Chicken\n6) Meatball");

        int customerCrustChoice;
        //TODO create an array list of meat toppings and a while loop to allow the user to go through topping options.
        ArrayList<Topping> toppings = new ArrayList<>();
        //display meat options
        System.out.println("pepperoni, sausage, ham, bacon, chicken, meatball");
        //ask which meat topping they want with input collector
        String meatTopping = InputCollector.promptForString("What type of meat topping would you like?");

        //assign the string to a new topping (make a new topping)
        Topping toppingMeat = new Topping(meatTopping, "meat", false);

        //add to our arraylist named toppings
        toppings.add(toppingMeat);

        //5 ask user what cheese topping they want
        System.out.println("Mozzarella, Parmesan, Ricotta, Goat, Cheese, Buffalo");
        //TODO make array list of cheese toppings
        String cheeseTopping = InputCollector.promptForString("What type of cheese topping would you like?");
        Topping toppingCheese = new Topping(cheeseTopping, "cheese", false);

        toppings.add(toppingCheese);

        //6 ask user what other toppings they want
        System.out.println(" onions, mushrooms,bell peppers,olives,tomatoes,spinach, basil, pineapple,anchovies ");
        String regularTopping = InputCollector.promptForString("What veggie topping would you like?");
        Topping toppingRegular = new Topping(regularTopping, "veggie", false);

        toppings.add(toppingRegular);

        //7 ask user what select sauces they want
        System.out.println(" marinara, alfredo, pesto, bbq, buffalo, olive oil ");
        String sauceTopping = InputCollector.promptForString("What type of sauce would you like?");
        //TODO make array list of sauce toppings
        Topping toppingSauce = new Topping(sauceTopping, "sauce", false);
        toppings.add(toppingSauce);


        //8 ask user if they would like stuffed crust
        String answer = InputCollector.promptForString("would you like stuffed crust?(Y/N)");

        boolean stuffedCrust = answer.equalsIgnoreCase("Y");

        Pizza pizza = new Pizza("", pizzaSize, crustChosen, stuffedCrust);

        pizza.setToppings(toppings);

        order.addProduct(pizza);


        //9 making pizza based on user input


    } //todo handle invalid inputs

}