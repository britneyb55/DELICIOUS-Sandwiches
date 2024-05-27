package com.pluralsight.models;


import java.util.ArrayList;
import java.util.List;

public class Sandwich extends OrderSize
{

    private int breadType;
    private int meatType;
    private List<Toppings> toppings;




    public Sandwich(int sizeType, int breadType,int meatType)
    {
        super(sizeType);
        this.breadType = breadType;
        this.meatType = meatType;
        this.toppings = new ArrayList<>();
    }

    public String getBreadType()
    {
        switch(breadType)
        {
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

    public String getMeatType()
    {
        switch(meatType)
        {
            case 1:
                return "Steak";
            case 2:
                return "ham";
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

    }


    public int getSize()
    {
        int size = getSizeType();
        return size;
    }


    @Override
    public double getSandwichSizePrice()
    {
        switch(getSize())
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
    public double getMeatToppingPrice()
    {
        switch(getSize())
        {
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                return 0.0;

        }

    }


    @Override
    public double getExtraMeatToppingPrice()
    {
        switch(getSize())
        {
            case 4:
                return .50;
            case 8:
                return 1.00;
            case 12:
                return 1.50;
            default:
                return 0.0;

        }
    }

    @Override
    public double getCheeseToppingPrice()
    {
        switch(getSize())
        {
            case 4:
                return .75;
            case 8:
                return 1.50;
            case 12:
                return 2.25;
            default:
                return 0.0;

        }
    }

    @Override
    public double getextraCheeseToppingPrice()
    {
        switch(getSize())
        {
            case 4:
                return .30;
            case 8:
                return .60;
            case 12:
                return .90;
            default:
                return 0.0;

        }
    }

    public void addToppings(Toppings toppings) {
        this.toppings.add(toppings);
    }
    public List<Toppings> getInventory()
    {
        return toppings;
    }
}


