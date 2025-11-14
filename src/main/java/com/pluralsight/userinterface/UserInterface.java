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
    public void welcomeScreen() {
        System.out.println("\n====== Welcome to Freddy Fazbear's pizza! ======");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.println("=======================");
    }

    //todo add pizza method, add drink method, add garlic knots method
    //todo create welcome screen and homescreen
    //todo figure out how to display toppings and handle meats and cheese


    public void display() {

        while (true) {
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

    public int orderScreenWithInput() {
        OrderManager orderManager = new OrderManager();
        orderManager.startNewOrder();
        Order order = orderManager.getCurrentOrder();

        // Order order = new Order();


        while (true) {
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

            switch (orderScreenChoice) {

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

        Garlicknot garlicknot = new Garlicknot("6 pack", "GarlicKnots");

        order.addProduct(garlicknot);
    }//todo tell user if it added properly

    private void addDrinkScreen(Order order) {

        System.out.println("==============");
        System.out.println("    DRINK OPTION    ");
        System.out.println("==============");

        String drinkName = InputCollector.promptForString("What drink flavor would you like?");
        System.out.println("Drink flavors: freddy’s fruity fizz, chica’s clucking cola, foxy’s pirate pineapple, bonnie’s blueberry blast");

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
                System.out.println("Invalid crust type. Please choose from the crust options listed.");
            }
        }

        String crustChosen = switch (customerCrustChoice) {
            case 1 -> "Thin" ;
            case 2 -> "Regular";
            case 3 -> "Thick";
            case 4 -> "Cauliflower";
            default -> "Error";
        };
        System.out.println();


        //3 ask user what pizza size they want
        List<Integer> pizzaSizeList = Arrays.asList(1, 2, 3);
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

        //8 ask user if they would like stuffed crust
        String answer = InputCollector.promptForString("would you like stuffed crust?(Y/N)");

        boolean isStuffedCrust = answer.equalsIgnoreCase("Y");

        Pizza pizza = new Pizza(pizzaSizeChosen, crustChosen, isStuffedCrust);

        //4 ask user what meat toppings they want

        boolean addingMoreMeat = true;
        List<Integer> meatList = Arrays.asList(1, 2, 3, 4, 5, 6);

        while (addingMoreMeat) {
            System.out.println("Meat Options:\n1) pepperoni\n2) sausage\n3) ham\n4) bacon\n5) chicken\n6) meatball");


            int customerMeatChoice;

            while (true) {
                customerMeatChoice = InputCollector.promptForInt("What meat topping would you like?");

                if (meatList.contains(customerMeatChoice)) {
                    break;
                } else {
                    System.out.println("Invalid meat type. Please choose from the meat options listed.");
                }
            }
            String meatToppingChosen = switch (customerMeatChoice) {
                case 1 -> "pepperoni";
                case 2 -> "sausage";
                case 3 -> "ham";
                case 4 -> "bacon";
                case 5 -> "chicken";
                case 6 -> "meatball";
                default -> "Error";
            };
            pizza.addTopping(new Topping(meatToppingChosen));

            //5 ask user what cheese topping they want
        }
            boolean addingMoreCheese = true;

            List<Integer> cheeseList = Arrays.asList(1, 2, 3, 4, 5);

            while (addingMoreCheese) {
                System.out.println("Cheese Options:\n1) mozzarella\n2) Parmesan\n3) Ricotta\n4) Goat\n5) Buffalo\n");

                int customerCheeseChoice;

                while (true) {
                    customerCheeseChoice = InputCollector.promptForInt("What cheese topping would you like?");

                    if (cheeseList.contains(customerCheeseChoice)) {
                        break;
                    } else {
                        System.out.println("Invalid cheese type. Please choose from the crust options listed.");
                    }
                }
                String cheeseToppingChosen = switch (customerCheeseChoice) {
                    case 1 -> "mozzarella";
                    case 2 -> "Parmesan";
                    case 3 -> "Ricotta";
                    case 4 -> "Goat";
                    case 5 -> "Buffalo";
                    default -> "Error";
                };
                pizza.addTopping(new Topping(cheeseToppingChosen));

            }

                boolean addingMoreRegularTopping = true;
                List<Integer> regularToppingList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
                while (addingMoreRegularTopping) {

                    System.out.println("Regular Topping Options:\n1) onions\n2) mushrooms\n3) bell peppers\n4) olives\n5) tomatoes\n6) spinach\n7) basil\n8) pineapple\n9) anchovies");

                    int customerRegularToppingChoice;

                    while (true) {
                        customerRegularToppingChoice = InputCollector.promptForInt("What regular topping would you like?");

                        if (regularToppingList.contains(customerRegularToppingChoice)) {
                            break;
                        } else {
                            System.out.println("Invalid regular topping type. Please choose from the topping options listed.");
                        }
                    }
                    String regularToppingChosen = switch (customerRegularToppingChoice) {
                        case 1 -> "onions";
                        case 2 -> "mushrooms";
                        case 3 -> "bell peppers";
                        case 4 -> "olives";
                        case 5 -> "tomatoes";
                        case 6 -> "spinach";
                        case 7 -> "basil";
                        case 8 -> "pineapple";
                        case 9 -> "anchovies";
                        default -> "Error";
                    };
                    pizza.addTopping(new Topping(regularToppingChosen));
                }
                    //7 ask user what select sauces they want


                    List<Integer> sauceList = Arrays.asList(1, 2, 3, 4, 5, 6);
                    System.out.println("sauce Options:\n1) marinara\n2) alfredo\n3) pesto\n4) bbq\n5) buffalo\n6) olive oil");

                    int customerSauceChoice;

                    while (true) {
                        customerSauceChoice = InputCollector.promptForInt("What sauce would you like?");

                        if (sauceList.contains(customerSauceChoice)) {
                            break;
                        } else {
                            System.out.println("Invalid sauce type. Please choose from the crust options listed.");
                        }
                    }
                    String sauceToppingChosen = switch (customerSauceChoice) {
                        case 1 -> "marinara";
                        case 2 -> "alfredo";
                        case 3 -> "pesto";
                        case 4 -> "bbq";
                        case 5 -> "buffalo";
                        case 6 -> "olive oil";
                        default -> "Error";
                    };
                    pizza.addTopping(new Topping(sauceToppingChosen));

                    // create an array list to hold all toppings
//                    List<Topping> toppings = new ArrayList<>();

                    // add all toppings the user has selected

//                    if (meatToppingChosen != null){
//                        Topping t = new Topping(meatToppingChosen);
//                        toppings.add(t);
//                    }
//
//                    if (cheeseToppingChosen != null){
//                        Topping t = new Topping(cheeseToppingChosen);
//                        toppings.add(t);
//                    }
//
//                    if (regularToppingChosen != null){
//                        Topping t = new Topping(regularToppingChosen);
//                        toppings.add(t);
//                    }
//
////                    if (regularToppingChosen != null){
////                        Topping t = new Topping(regularToppingChosen);
////                        toppings.add(t);
////                    }
//
//                    if (sauceToppingChosen != null){
//                        Topping t = new Topping(sauceToppingChosen);
//                        toppings.add(t);
//                    }


//                    pizza.setToppings(toppings);

                    order.addProduct(pizza);


                    //9 making pizza based on user input


                } //todo handle invalid inputs
            }