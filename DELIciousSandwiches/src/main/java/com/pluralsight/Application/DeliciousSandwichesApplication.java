package com.pluralsight.Application;

import com.pluralsight.models.Sandwich;
import com.pluralsight.models.Toppings;
import com.pluralsight.ui.UserInterface;

import java.util.List;
import java.util.Scanner;

public class DeliciousSandwichesApplication
{
    private Scanner scanner = new Scanner(System.in);
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
        try
        {
            while (true)
            {
                int orderChoice = userInterface.orderScreen();

                switch (orderChoice)
                {
                    case 1:
                        addSandwich();
                        break;
                    case 2:
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

    private void addSandwich() {
        int sizeType = addSandwichSize();
        int breadType = sandwichBread();
        int meatType = sandwichMeatTopping();
        sandwichOrder = new Sandwich(sizeType, breadType,meatType);
        addSandwichToppings();

        System.out.println("Your order: " + sandwichOrder.getBreadType() + ", " + sandwichOrder.getSize() + " inches." + sandwichOrder.getMeatType());
        for(Toppings toppings: sandwichOrder.getInventory())
        {
            System.out.printf(" %s , %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s  \n", toppings.getExtraMeat(), toppings.getCheese(), toppings.getExtraCheese(), toppings.getLettuce(), toppings.getPeppers(), toppings.getOnions(), toppings.getTomatoes(), toppings.getJalepenos(), toppings.getCucumbers(), toppings.getPeppers(), toppings.getGuacamole(), toppings.getMushrooms(), toppings.getMayo(), toppings.getMustard(), toppings.getKetchup(), toppings.getRanch(), toppings.getThousand_islands(), toppings.getVinaigrette(), toppings.getSauce() );
        }
        System.out.println();
        System.out.println("Press enter to go back to menu");
        scanner.nextLine();


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

    private int sandwichMeatTopping()
    {
        while(true)
        {
            try
            {
                int sandwichMeat = userInterface.meatTopping();

                switch(sandwichMeat)
                {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return sandwichMeat;
                    default:
                        System.out.println("Invalid selection. Please choose a valid meat type.");

                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [1- 6]");

            }
        }
    }

    private void addSandwichToppings() {
        String extraMeat = extraMeatTopping();
        String cheese = cheeseTopping();
        String extraCheese = extraCheeseTopping();
        String lettuce = lettuceTopping();
        String peppers = peppersTopping();
        String onions = onionsTopping();
        String tomatoes = tomatoesTopping();
        String jalepenos = jalepenosTopping();
        String cucumbers = cucumbersTopping();
        String pickles = picklesTopping();
        String guacamole = guacamoleTopping();
        String mushrooms = mushroomsTopping();
        String mayo = mayoTopping();
        String mustard = mustardTopping();
        String ketchup = katchupTopping();
        String ranch = ranchTopping();
        String thousandIsland = thousandIslandTopping();
        String vinaigrette = vinaigretteTopping();
        String sides = auJusTopping(); // Corrected method name

        Toppings toppings = new Toppings(extraMeat, cheese, extraCheese, lettuce, peppers, onions, tomatoes, jalepenos, cucumbers, pickles, guacamole, mushrooms, mayo, mustard, ketchup, ranch, thousandIsland, vinaigrette, sides);
        sandwichOrder.addToppings(toppings);
    }



    private String extraMeatTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.extraMeat();

                switch(extraMeat)
                {
                    case 1:
                        return "Extra Meat";
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

    private String cheeseTopping()
    {
        while(true)
        {
            try
            {
                int cheese = userInterface.cheeseTopping();

                switch(cheese)
                {
                    case 1:
                        return "American cheese";
                    case 2:
                        return "provolone cheese";
                    case 3:
                        return "cheddar cheese";
                    case 4:
                        return "swiss cheese";
                    case 5:
                        return "No cheese";
                    default:
                        System.out.println("Sorry I could not get that. Would you like extra meat? " +
                                "[1] yes and [2] no.");

                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [0-5]");

            }
        }

    }

    private String extraCheeseTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.extraCheese();

                switch(extraMeat)
                {
                    case 1:
                        return "Extra Cheese";
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

    private String lettuceTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.lettuceTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "Lettuce";
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

    private String peppersTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.pepperTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "pepper";
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

    private String onionsTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.onionsTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "onions";
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

    private String tomatoesTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.tomatoesTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "tomatoes";
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

    private String jalepenosTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.jalepenosTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "jalepenos";
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

    private String cucumbersTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.cucumbersTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "cucumbers";
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

    private String picklesTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.picklesTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "pickles";
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

    private String guacamoleTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.guacamoleTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "guacamole";
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

    private String mushroomsTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.mushroomsTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "mushrooms";
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

    private String mayoTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.mayoTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "mayo";
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

    private String mustardTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.mustardTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "mustard";
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

    private String katchupTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.ketchupTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "ketchup";
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

    private String ranchTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.ranchTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "ranch";
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

    private String thousandIslandTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.thousandIslandsTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "thousandIsland";
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

    private String vinaigretteTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.vinaigretteTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "vinaigrette";
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

    private String auJusTopping()
    {
        while(true)
        {
            try
            {
                int extraMeat = userInterface.sidesTopping();

                switch(extraMeat)
                {
                    case 1:
                        return "au just";
                    case 2:
                        return "sauce";
                    case 3:
                        return "au just and sauce";
                    default:
                        System.out.println("Sorry I could not get that. Would you like sauce? " +
                                "[1] yes and [2] no.");

                }
            }catch(NumberFormatException e)
            {
                System.out.println("Please enter a number of between [1- 2]");

            }
        }

    }























}
