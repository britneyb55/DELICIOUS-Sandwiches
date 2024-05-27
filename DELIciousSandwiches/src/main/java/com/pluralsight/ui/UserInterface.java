package com.pluralsight.ui;

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
        System.out.println("Welcome To DELICIOUS sandwiches");
        System.out.println();
        System.out.println("Would you like to:");
        System.out.println();
        System.out.println(" [1] Order a sandwiches");
        System.out.println(" [0] Exit");
        System.out.println("-".repeat(50));
        return Integer.parseInt(scanner.nextLine().strip());

    }

    public int orderScreen()
    {
        System.out.println(("-").repeat(50));
        System.out.println(("*").repeat(50));
        System.out.println("Our Menu:");
        System.out.println();
        System.out.println(" [1] Sandwich");
        System.out.println(" [2] Drinks");
        System.out.println(" [3] Chips");
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

    public int meatTopping()
    {
        System.out.println();
        System.out.println("What kind of meat would you like on Your Sandwich?");
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
        System.out.println("Would you like extra meat?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int cheeseTopping()
    {
        System.out.println("Would you Cheese");
        System.out.println(" [1] American");
        System.out.println(" [2] Provolone");
        System.out.println(" [3] Cheddar");
        System.out.println(" [5] Swiss");
        System.out.println(" [0] No Cheese");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int extraCheese()
    {
        System.out.println("Would you like extra Cheese?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int lettuceTopping()
    {
        System.out.println("Would you like Lettuce?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int pepperTopping()
    {
        System.out.println("Would you like pepper?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int onionsTopping()
    {
        System.out.println("Would you like Onions?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int tomatoesTopping()
    {
        System.out.println("Would you like Tomatoes?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int jalepenosTopping()
    {
        System.out.println("Would you like Jalepenos?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int cucumbersTopping()
    {
        System.out.println("Would you like Cucumbers?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int picklesTopping()
    {
        System.out.println("Would you like pickles?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int guacamoleTopping()
    {
        System.out.println("Would you like guacamole?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int mushroomsTopping()
    {
        System.out.println("Would you like muchrooms?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int mayoTopping()
    {
        System.out.println("Would you like mayo?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int mustardTopping()
    {
        System.out.println("Would you like mustard?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int ketchupTopping()
    {
        System.out.println("Would you like ketchup?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int ranchTopping()
    {
        System.out.println("Would you like ranch?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int thousandIslandsTopping()
    {
        System.out.println("Would you like thousand Islands?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int vinaigretteTopping()
    {
        System.out.println("Would you like vinaigrette?");
        System.out.println(" [1] yes");
        System.out.println(" [2] no");
        return Integer.parseInt(scanner.nextLine().strip());
    }

    public int sidesTopping() {
        System.out.println("Would you like au jus, sauce, or both?");
        System.out.println("[1] Au Jus");
        System.out.println("[2] Sauce");
        System.out.println("[3] Both");
        return Integer.parseInt(scanner.nextLine().strip());
    }




















}
