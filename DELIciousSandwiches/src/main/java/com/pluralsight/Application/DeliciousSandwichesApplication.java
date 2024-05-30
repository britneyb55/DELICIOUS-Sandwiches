package com.pluralsight.Application;

import com.pluralsight.models.*;
import com.pluralsight.services.SandwichFileManager;
import com.pluralsight.ui.UserInterface;

import java.util.Scanner;



public class DeliciousSandwichesApplication
{
    private Scanner scanner = new Scanner(System.in);
    private static Cashier orders;
    private Sandwich sandwichOrder;
    private UserInterface userInterface = new UserInterface();


    public void run()
    {
        try {
            while (true) {
                int choice = userInterface.homeScreen();

                switch (choice) {
                    case 1:
                        newOrder();
                    case 2:
                        return;
                }
            }
        }catch(NumberFormatException e)
        {
            System.out.println("-".repeat(50));
            System.out.println("Sorry I did not get that.. \n Please enter a number 1 or 0 \n");
            run();
        }
    }

    private void newOrder()
    {
        orders = userInterface.getCustomerInformation();
        try
        {
            while(true)
            {
                int orderChoice = userInterface.orderScreen();

                switch (orderChoice)
                {
                    case 1:
                        addSandwich(orders);
                        break;
                    case 2:
                        addDrink(orders);
                        break;
                    case 3:
                        addChips(orders);
                        break;
                    case 4:
                        Checkout(orders);
                        return;
                    case 5:
                        Cancel(orders);
                        return;
                    default:
                        System.out.println("Sorry something went wrong. Please enter number between [0-3]");
                }
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("-".repeat(50));
            System.out.println("Please enter a number between [0-3]");
            newOrder();
        }
    }




    private void addSandwich(Cashier orders)
    {
        int sizeType = addSandwichSize();
        int breadType = sandwichBread();


        String meat = sandwichMeatTopping();
        boolean extraMeat = extraMeatTopping();
        String cheese = cheeseTopping();
        boolean extraCheese = extraCheeseTopping();

        sandwichOrder = new Sandwich(sizeType, meat, breadType);
        orders.add(sandwichOrder);

        Boolean toastedSandwich = toastedSandwich();
        sandwichOrder.setToasted(toastedSandwich);

        ExtraCostTopping extraCostTopping = new ExtraCostTopping("Topping:", sizeType, meat ,extraMeat, cheese, extraCheese);
        sandwichOrder.addToppings(extraCostTopping);

        String customerToppings = regularTopping();
        Topping regularToppings = new RegularTopping(customerToppings);
        sandwichOrder.addToppings(regularToppings);
        anotherTopping();

        String sauce = sauceTopping();
        Topping sauceTopping = new RegularTopping(sauce);
        sandwichOrder.addToppings(sauceTopping);
        anotherSauceTopping();

        String side = sides();
        Topping sides = new RegularTopping(side);
        sandwichOrder.addToppings(sides);

        System.out.println("Your Sandwich Order is successfully saved!");

        System.out.println();
        System.out.println("Press enter to go back to menu");
        scanner.nextLine();

    }



    private void addDrink(Cashier orders)
    {
        String drinkSize = drinkSize();
        Drinks customerDrink = new Drinks( drinkSize);
        orders.add(customerDrink);

        System.out.println(customerDrink.getDrinkSize());
        System.out.println(customerDrink.getPrice());


    }


    private String drinkSize()
    {
        while (true)
        {
            int drinkSize = userInterface.drinks();
            switch (drinkSize)
            {
                case 1:
                    return "Small";
                case 2:
                    return "Medium";
                case 3:
                    return "Large";
                default:
                    System.out.println("Invalid selection. Please choose a valid Drink size.");
            }
        }
    }

    private void addChips(Cashier orders)
    {
        boolean chips = chips();
        Chips chip = new Chips(chips);
        orders.add(chip);

        System.out.println(chip.isType());
        System.out.println(chip.getPrice());

    }

    private boolean chips()
    {
        while (true)
        {
            int drinkSize = userInterface.chips();
            switch (drinkSize)
            {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println("Invalid selection. Please choose a valid Drink size.");
            }
        }
    }



    private void Checkout(Cashier orders)
    {
        orders.displayTopping();



        int userChoice = userInterface.checkOut();
        switch(userChoice)
        {
            case 1:
                Confirm(orders);
                break;
            case 2:
                Cancel(orders);
                break;
            default:
                System.out.println("Please enter [1] Confirm Or [2] To Cancel");

        }


    }



    private void Confirm(Cashier orders)
    {
        SandwichFileManager sandwichFileManager = new SandwichFileManager(orders.getOrderDateTime());
        sandwichFileManager.saveOrder(orders);


    }

    private void Cancel(Cashier orders)
   {
       orders.getOrders().clear();


    }





    private int addSandwichSize()
    {
        while (true)
        {
            try {
                int sandwichSize = userInterface.addSandwich();
                switch (sandwichSize) {
                    case 1:
                    case 2:
                    case 3:
                        return sandwichSize;
                    default:
                        System.out.println("Invalid selection. Please choose a valid sandwich size.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number of between [1- 3]");
            }
        }
    }

    private int sandwichBread()
    {
        while (true)
        {
            try {
                int breadTypeChoice = userInterface.sandwichBread();
                switch (breadTypeChoice) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return breadTypeChoice;
                    default:
                        System.out.println("Invalid selection. Please choose a valid bread type.");
                        break;

                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number between [1-4]");
            }
        }
    }

    private boolean toastedSandwich()
    {
        while(true)
        {
                int toastedSandwich = userInterface.toastedSandwich();
                switch(toastedSandwich)
                {
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        System.out.println("Sorry I could not get that. Would you like extra meat? " +
                                "[1] yes or [2] no.");

                }

        }


    }


    private String sandwichMeatTopping()
    {
        while(true)
        {
            try
            {
                int sandwichMeat = userInterface.meatTopping();

                switch (sandwichMeat)
                {
                    case 1:
                        return "Steak";
                    case 2:
                        return "Ham";
                    case 3:
                        return "Salami";
                    case 4:
                        return "Roast Beef";
                    case 5:
                        return "Chicken";
                    case 6:
                        return "Bacon";
                   default:
                        return "Invalid selection. Please choose a valid meat type.";

                }

            } catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [1- 6]");

            }
        }

    }

    private boolean extraMeatTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.extraMeat();

                switch(extraMeat)
                {
                    case 1:
                        return true;
                    case 2:
                        return false ;
                    default:
                        System.out.println("Sorry I could not get that. Would you like extra meat? " +
                                "[1] yes or [2] no.");
                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [1- 2]");
            }
        }
    }

    private String cheeseTopping()
    {
        while (true) {
            try {
                int cheese = userInterface.cheeseTopping();
                switch (cheese) {
                    case 1:
                        return "American cheese";
                    case 2:
                        return "Provolone cheese";
                    case 3:
                        return "Cheddar cheese";
                    case 4:
                        return "Swiss cheese";
                    case 0:
                        return "No cheese";
                    default:
                        System.out.println("Invalid selection. Please choose a valid cheese type.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number of between [1-5]");
            }
        }
    }

    private boolean extraCheeseTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.extraCheese();

                switch(extraMeat)
                {
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        System.out.println("Sorry I could not get that. Would you like extra meat? " +
                                "[1] yes and [2] no.");

                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [1- 2]");

            }
        }

    }

    private String regularTopping()
    {
        while(true)
        {
            try
            {
                int topping = userInterface.regularToppings();

                switch(topping)
                {
                    case 1:
                        String lettuce = "Lettuce";
                        return lettuce;
                    case 2:
                        return "Peppers";
                    case 3:
                        return "Onions";
                    case 4:
                        return "Tomatoes";
                    case 5:
                        return "jalepenos";
                    case 6:
                        return "Cucumbers";
                    case 7:
                        return "pickles";
                    case 8:
                        return "guacamole";
                    case 9:
                        return " mushrooms";
                    default:
                        System.out.println("Sorry I could not get that. Would you like extra meat? " +
                                "[1] yes and [2] no.");

                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [1- 2]");

            }



        }
    }

    private void anotherTopping()
    {
        while (true) {
            try {
                int choice = userInterface.selectAnotherTopping();

                switch (choice) {
                    case 1:
                        String additionalTopping = regularTopping();
                        sandwichOrder.addToppings(new RegularTopping(additionalTopping));
                        break;
                    case 2:
                        // If the user chooses not to add another topping, simply return from this method
                        return;
                    default:
                        System.out.println("Invalid selection. Please choose [1] to add another topping or [2] to finish.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number [1-2]");
            }
        }
    }


    private String sauceTopping()
    {

        while(true)
        {
            try
            {
                int choice = userInterface.sauce();

                switch(choice)
                {
                    case 1:
                       return  "mayo";
                    case 2:
                        return "mustard";
                    case 3:
                        return  "ketchup";
                    case 4:
                        return  "ranch";
                    case 5:
                        return  "thousand islands";
                    case 6:
                        return  "vinaigrette";
                    default:
                        System.out.println("Invalid selection. Please choose [1] to add another topping or [2] to finish.");
                }
            } catch(NumberFormatException e)
            {
                System.out.println("Please enter a number [1-2]");
            }
        }
    }

    private void anotherSauceTopping()
    {
        while (true)
        {
            try {
                int choice = userInterface.selectAnotherSauceTopping();

                switch (choice) {
                    case 1:
                        String additionalTopping = sauceTopping();
                        sandwichOrder.addToppings(new RegularTopping(additionalTopping));
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("Invalid selection. Please choose [1] to add another topping or [2] to finish.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number [1-2]");
            }
        }
    }

    private String sides()
    {

        while(true)
        {
            try
            {
                int choice = userInterface.sides();

                switch(choice)
                {
                    case 1:
                        return  "au jus";
                    case 2:
                        return "sauce";
                    case 3:
                        return  "au just and sauce";
                    default:
                        System.out.println("Invalid selection. Please choose [1] to add another topping or [2] to finish.");
                }
            } catch(NumberFormatException e)
            {
                System.out.println("Please enter a number [1-2]");
            }
        }
    }

}
