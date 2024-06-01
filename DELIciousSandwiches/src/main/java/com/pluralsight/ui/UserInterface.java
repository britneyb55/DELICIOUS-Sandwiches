package com.pluralsight.ui;

import com.pluralsight.models.Cashier;


import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        System.out.println("Welcome To GRAND DELI Torta Sandwiches");
        System.out.println();
        System.out.println("Would you like to:");
        System.out.println();
        System.out.println(" [1] New Order");
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
        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd - hh:mm:ss");


        return new Cashier(customerName, currentDateTime.format(dateFormatter1));
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
        System.out.println(" [5] Cancel Order");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }


    public int addSandwich()
    {
        System.out.println();
        System.out.println("-".repeat(70));
        System.out.println();
        System.out.println("Sandwich Menu: ");
        System.out.println();
        System.out.println("*".repeat(70));
        System.out.println("Sandwich Size Available:");
        System.out.println();
        System.out.println(" Small 4''    $5.50  || Medium 8''    $7.00  || Large 12''   $8.50 ");
        System.out.println();
        System.out.println("Meat Prices:");
        System.out.println(" 4' inch       $1.00  || 8' inch      $2.00  || 12' inch     $3.00 ");
        System.out.println();
        System.out.println("Extra Meat Price:");
        System.out.println(" 4' inch       $.50   || 8' inch      $1.00  || 12' inch     $1.50 ");
        System.out.println();
        System.out.println("Cheese Price:");
        System.out.println(" 4' inch        $.75  || 8' inch      $1.50  || 12' inch     $2.25 ");
        System.out.println();
        System.out.println("Extra Cheese Price:");
        System.out.println(" 4' inch         $.30 || 8' inch       $.60  || 12' inch     $.90  ");
        System.out.println("*".repeat(70));
        System.out.println();
        System.out.println("What size would you like you Sandwich?");
        System.out.println(" [1] Small 4''     ");
        System.out.println(" [2] Medium 8''    ");
        System.out.println(" [3] Large 12''    ");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int drinks()
    {
        System.out.println();
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Drinks Menu");
        System.out.println("[1] Small     $2.00 ");
        System.out.println("[2] Medium    $2.50 ");
        System.out.println("[3] Large     $3.00 ");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());


    }

    public int drinkType()
    {
        System.out.println();
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Drinks Menu");
        System.out.println(" [1] Coke ");
        System.out.println(" [2] Sprite ");
        System.out.println(" [3] Dr Pepper ");
        System.out.println(" [4] Fanta ");
        System.out.println(" [5] Vitamin Water");
        System.out.println(" [6] Water ");

        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());


    }




    public int ChipType()
    {
        System.out.println();
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println( " Chips      $1.50 each");
        System.out.println();
        System.out.println(" [1] Lays");
        System.out.println(" [2] Doritos ");
        System.out.println(" [3] Cheetos");
        System.out.println(" [4] Lays Baked");
        System.out.println(" [5] Sun Chips ");
        System.out.println(" [6] Ruffles ");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());


    }

    public int checkOut()
    {
        System.out.println();
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println(" [1] Confirm");
        System.out.println(" [2] Cancel");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());

    }


    public int sandwichBread()
    {
        System.out.println();
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
        System.out.println();
        System.out.println("What kind of meat would you like on Your Sandwich?");
        System.out.println();
        System.out.println("We got:");
        System.out.println();
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
        System.out.println();
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        System.out.println("-".repeat(50));
       return Integer.parseInt(scanner.nextLine().strip());
    }

    public int cheeseTopping()
    {
        System.out.println();
        System.out.println();
        System.out.println("Would you like cheese?");
        System.out.println();
        System.out.println(" [1] American");
        System.out.println(" [2] Provolone");
        System.out.println(" [3] Cheddar");
        System.out.println(" [4] Swiss");
        System.out.println(" [5] No Cheese");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int extraCheese()
    {
        System.out.println();
        System.out.println("Would you like extra Cheese?");
        System.out.println();
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        System.out.println("-".repeat(50));
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
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public int selectAnotherTopping()
    {
        System.out.println();
        System.out.println("Would you like to select another topping?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        System.out.println("-".repeat(50));
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
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int selectAnotherSauceTopping()
    {
        System.out.println();
        System.out.println("Would you like to select another topping?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public int sides()
    {
        System.out.println();
        System.out.println("Sides:");
        System.out.println(" [1] au jus");
        System.out.println(" [2] sauce");
        System.out.println(" [3] Both au jus and sauce");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());

    }


}
