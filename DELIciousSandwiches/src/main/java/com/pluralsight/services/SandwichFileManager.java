package com.pluralsight.services;

import com.pluralsight.models.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SandwichFileManager
{
    private final String LOG_DIRECTORY_PATH = "files";
    private String filePath;

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

    public void saveOrder(Cashier orders)
    {
        File logFile = new File(filePath);

        try(FileWriter fileWriter = new FileWriter(logFile);
            PrintWriter writer = new PrintWriter(fileWriter)
        ) {


            for (Order order : orders.getOrders())
            {
                if (order instanceof Sandwich)
                {
                    Sandwich sandwich = (Sandwich) order;
                    writer.printf("%d'' %s Sandwich                    %.2f \n", sandwich.getSizeType(), sandwich.getMeatType(), sandwich.getPrice());
                    writer.write(sandwich.displayTopping() + "\n");
                } else if (order instanceof Drinks) {
                    Drinks drink = (Drinks) order;
                    writer.printf("Drink (Size: %s)                    %.2f \n", drink.getDrinkSize(), drink.getPrice());
                } else if (order instanceof Chips) {
                    Chips chips = (Chips) order;
                    writer.printf("Chips (Type: %s)                    %.2f \n", chips.isType() ? "With Chips" : "No Chips", chips.getPrice());
                }
            }


        }
        catch (IOException ex)
        {
            System.out.println("Data transaction failed");
        }

    }

}
