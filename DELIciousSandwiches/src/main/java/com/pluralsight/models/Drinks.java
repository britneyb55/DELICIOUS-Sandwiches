package com.pluralsight.models;


import com.pluralsight.models.Interface.Size;

public class Drinks extends Order implements Size
{
    private String drinkSize;
    private String drinkType;

    public Drinks(String drinkSize, String drinkType) {
        this.drinkSize = drinkSize;
        this.drinkType = drinkType;
    }

    public String getDrinkType()
    {
        if ( drinkType.equalsIgnoreCase("Coke")
                || drinkType.equalsIgnoreCase("Sprite")
                || drinkType.equalsIgnoreCase("Dr Pepper")
                || drinkType.equalsIgnoreCase("Fanta")
                || drinkType.equalsIgnoreCase("Water")
                || drinkType.equalsIgnoreCase("Vitamin water"))
        {
            return drinkType;
        }
        else {
            return "None";
        }

    }

    public String getDrinkSize() {
        return drinkSize;
    }

    @Override
    public double sizeType()
    {
        switch (drinkSize) {
            case "Small":
                return 2.00;
            case "Medium":
                return 2.50;
            case "Large":
                return 3.00;
            default:
                return 0.0;
        }
    }



    @Override
    public double getPrice()
    {
        double drinkPrice = sizeType();
        return drinkPrice;
    }


}
