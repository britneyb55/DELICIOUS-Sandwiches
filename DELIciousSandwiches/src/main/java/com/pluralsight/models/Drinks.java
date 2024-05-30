package com.pluralsight.models;


import com.pluralsight.models.Interface.Size;

public class Drinks extends Order implements Size
{
    private String drinkSize;

    public Drinks(String drinkSize) {
        this.drinkSize = drinkSize;
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
