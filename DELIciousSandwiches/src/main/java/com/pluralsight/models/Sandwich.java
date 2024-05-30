package com.pluralsight.models;


import com.pluralsight.models.Interface.ToppingSize;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Order {

    private int sizeType;
    private String meatType;
    private int breadType;
    private boolean toasted;
    private List<Topping> toppings;

    public Sandwich(int sizeType, String meatType , int breadType) {
        this.sizeType = sizeType;
        this.meatType = meatType;
        this.breadType = breadType;
        this.toppings = new ArrayList<>();
    }

    public String getBreadType() {
        switch (breadType) {
            case 1:
                return "White bread";
            case 2:
                return "Wheat";
            case 3:
                return "Rye";
            case 4:
                return "Wrap";
            default:
                return "Invalid selection. Please choose a valid bread type.";

        }
    }

    public String getMeatType() {
        return meatType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }


    public int getSizeType()
    {
        if (sizeType == 1) {
            return 4;

        } else if (sizeType == 2) {
            return 8;

        } else if (sizeType == 3) {
            return 12;
        } else {
            return 0;
        }
    }


    public double getSandwichSizePrice()
    {
        switch(getSizeType())
        {
            case 4:
                return 5.50;
            case 8:
                return 7.00;
            case 12:
                return 8.50;
            default:
                return 0.0;

        }

    }


    @Override
    public double getPrice()
    {
        double totalCost = 0.0;

        for (Topping topping: toppings)
        {
            if(topping instanceof ExtraCostTopping)
            {
                totalCost += ((ExtraCostTopping) topping).getPrice();
            }
        }
        totalCost += getSandwichSizePrice();

        return totalCost;
    }


    public List<Topping> getInventory()
    {
        return toppings;
    }

    public void displayTopping()
    {
        for (Topping topping: toppings)
        {
            if(topping instanceof ExtraCostTopping)
            {
                System.out.println(" - Extra Meat: " + ((ExtraCostTopping) topping).isExtraMeat());
                System.out.println(" - Cheese: " + ((ExtraCostTopping) topping).isCheese());
                System.out.println(" - Extra Cheese: " + ((ExtraCostTopping) topping).isExtraCheese());
            }
            System.out.println(topping);
        }

    }


    public void addToppings(Topping topping)
    {
        toppings.add(topping);

    }



}


