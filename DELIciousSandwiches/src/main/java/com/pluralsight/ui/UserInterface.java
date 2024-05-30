package com.pluralsight.ui;

import com.pluralsight.models.Cashier;


import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UserInterface
{
    private Scanner scanner = new Scanner(System.in);

    public int homeScreen()
    {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("Welcome To  Bay-z Deli sandwiches ");
        System.out.println();
        System.out.println("Would you like to:");
        System.out.println();
        System.out.println(" [1] Order a sandwiches");
        System.out.println(" [0] Exit");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public Cashier getCustomerInformation()
    {
        System.out.println(("-").repeat(50));
        System.out.println(("*").repeat(50));
        System.out.println();
        System.out.println("Information: ");
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        LocalDateTime currentDateTime = LocalDateTime.now();

        return new Cashier(customerName, currentDateTime);
    }

    public int orderScreen()
    {
        System.out.println(("-").repeat(50));
        System.out.println(("-").repeat(50));
        System.out.println("Our Menu:");
        System.out.println();
        System.out.println(" [1] Sandwich");
        System.out.println(" [2] Drinks");
        System.out.println(" [3] Chips");
        System.out.println(" [4] Checkout");
        System.out.println(" [0] Cancel Order");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }


    public int addSandwich()
    {

        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("What size would you like you Sandwich?");
        System.out.println(" [1] Small 4''");
        System.out.println(" [2] Medium 8''");
        System.out.println(" [3] Large 12''");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int drinks()
    {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Drinks Menu");
        System.out.println("[1] Small");
        System.out.println("[2] Medium");
        System.out.println("[3] Large");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());


    }

    public int chips()
    {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Chips Menu");
        System.out.println("[1] yes");
        System.out.println("[2] no");
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public void checkOut()
    {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("CheckOut");


    }


    public int sandwichBread()
    {
        System.out.println();
        System.out.println("What Sandwich Bread would you like?");
        System.out.println(" [1] White bread");
        System.out.println(" [2] Wheat");
        System.out.println(" [3] Rye");
        System.out.println(" [4] Wrap");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int toastedSandwich()
    {
       System.out.println();
      System.out.println("Would you like the Sandwich Toasted?");
       System.out.println(" [1] yes");
       System.out.println(" [2] no");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int meatTopping()
    {
        System.out.println();
        System.out.println("What kind of meat would you like on Your Sandwich?");
        System.out.println("We got:");
        System.out.println(" [1] Steak");
        System.out.println(" [2] ham");
        System.out.println(" [3] Salami");
        System.out.println(" [4] Roast Beef");
        System.out.println(" [5] Chicken");
        System.out.println(" [6] Bacon");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }


    public int extraMeat()
    {
        System.out.println();
       System.out.println("Would you like extra meat?");
        System.out.println(" [1] yes");
      System.out.println(" [2] no");
        System.out.println("-".repeat(50));
       return Integer.parseInt(scanner.nextLine().strip());
    }

    public int cheeseTopping()
    {
        System.out.println();
        System.out.println("Would you like cheese?");
        System.out.println(" [1] American");
        System.out.println(" [2] Provolone");
        System.out.println(" [3] Cheddar");
        System.out.println(" [4] Swiss");
        System.out.println(" [0] No Cheese");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int extraCheese()
    {
        System.out.println();
        System.out.println("Would you like extra Cheese?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int regularToppings()
    {
        System.out.println();
        System.out.println("Healthy Toppings");
        System.out.println(" [1] lettuce");
        System.out.println(" [2] Peppers");
        System.out.println(" [3] Onions");
        System.out.println(" [4] Tomatoes");
        System.out.println(" [5] jalepenos");
        System.out.println(" [6] cucumbers");
        System.out.println(" [7] pickles");
        System.out.println(" [8] guacamole");
        System.out.println(" [9] mushrooms");
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public int selectAnotherTopping()
    {
        System.out.println();
        System.out.println("Would you like to select another topping?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public int sauce()
    {
        System.out.println();
        System.out.println("Sauce:");
        System.out.println(" [1] mayo");
        System.out.println(" [2] mustard");
        System.out.println(" [3] ketchup");
        System.out.println(" [4] ranch");
        System.out.println(" [5] thousand Island");
        System.out.println(" [6] vinaigrette");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int selectAnotherSauceTopping()
    {
        System.out.println();
        System.out.println("Would you like to select another topping?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public int sides()
    {
        System.out.println();
        System.out.println("Sides:");
        System.out.println(" [1] au jus");
        System.out.println(" [2] sauce");
        System.out.println(" [3] Both au jus and sauce");
        return Integer.parseInt(scanner.nextLine().strip());

    }















}
