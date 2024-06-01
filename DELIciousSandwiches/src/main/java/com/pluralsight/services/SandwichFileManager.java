package com.pluralsight.services;

import com.pluralsight.models.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.time.format.DateTimeFormatter;


public class SandwichFileManager
{
    private final String LOG_DIRECTORY_PATH = "receipts";
    private static String filePath;

    public SandwichFileManager(String fileName)
    {
        // this makes sure that the logs folder is created
        File directory = new File(LOG_DIRECTORY_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }

        // create a variable with the correct file path
//        this.fileName = fileName;
        this.filePath = LOG_DIRECTORY_PATH + "/" + fileName;
        if (!this.filePath.toLowerCase().endsWith(".txt")) {
            this.filePath += ".txt";
        }

    }

    public static void saveOrder(Cashier orders)
    {
        File file = new File(filePath);

        try(FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter)
        ) {

            writer.write(" ".repeat(10) + " GRAND DELI Torta Sandwiches  \n");

            writer.write(String.format(" Customer: %s \n Order Date: %s \n Order Ready in 15 Min\n", orders.getCustomerName(), orders.getOrderDateTime()));

            writer.write(" Sandwiches:\n");
            for (Order order : orders.getOrders())
            {
                if (order instanceof Sandwich)
                {
                    Sandwich sandwich = (Sandwich) order;

                    writer.printf("\n %d'' %s Sandwich                     $ %.2f \n", sandwich.getSizeType(), sandwich.getMeatType(), sandwich.getPrice());

                    List<Topping> toppings = sandwich.getInventory();
                    for (Topping topping : toppings) {
                        if (topping instanceof ExtraCostTopping)
                        {
                            writer.printf(" Extra Meat: %b\n", ((ExtraCostTopping) topping).isExtraMeat());
                            writer.printf(" Cheese: %s\n", ((ExtraCostTopping) topping).isCheese());
                            writer.printf(" Extra Cheese: %b\n", ((ExtraCostTopping) topping).isExtraCheese());
                        }
                        writer.println(" ".repeat(4) + topping);
                    }

                } else if (order instanceof Drinks)
                {
                    Drinks drink = (Drinks) order;
                    writer.write(" \n");
                    writer.printf(" Drink %s (Size: %s)                  $ %.2f \n",drink.getDrinkType() ,drink.getDrinkSize(), drink.getPrice());
                } else if (order instanceof Chips)
                {
                    Chips chips = (Chips) order;
                    writer.write(" \n");
                    writer.printf(" %s Chips               $ %.2f \n", chips.isType(), chips.getPrice());
                }

            }
            writer.write("-".repeat(50));
            writer.write(" \n Total :" + " ".repeat(33)+ "$ "+orders.getPrice());

        }
        catch (IOException ex)
        {
            System.out.println("Data transaction failed");
        }

    }

}
