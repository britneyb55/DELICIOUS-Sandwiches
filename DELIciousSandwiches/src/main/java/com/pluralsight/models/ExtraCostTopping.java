package com.pluralsight.models;

import com.pluralsight.models.Interface.ToppingSize;

public class ExtraCostTopping extends Topping implements ToppingSize
{
    private int sizeType;
    private String meat;
    private boolean extraMeat;
    private String cheese;
    private boolean extraCheese;;

    public ExtraCostTopping(String type, int sizeType, String meat, boolean extraMeat, String cheese, boolean extraCheese) {
        super(type);
        this.sizeType = sizeType;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public String isCheese() {
        return cheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }


    @Override
    public int sizeType()
    {
        if (sizeType == 1)
        {
            return 4;

        }else if(sizeType == 2)
        {
            return 8;

        } else if (sizeType == 3)
        {
            return 12;
        }
        else{
            return 0;
        }
    }

    public double getMeatToppingPrice()
    {
        if(meat.equalsIgnoreCase("Steak")
                || meat.equalsIgnoreCase("ham")
                || meat.equalsIgnoreCase("Salami")
                || meat.equalsIgnoreCase("Roast Beef")
                || meat.equalsIgnoreCase("Chicken")
                || meat.equalsIgnoreCase("Bacon"))
        {
            switch(sizeType())
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
        else{
            return 0.0;
        }
    }

    public double getExtraMeatToppingPrice()
    {
        if(extraMeat)
        {
            switch(sizeType())
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
        else{
            return 0.0;
        }

    }


    public double getCheeseToppingPrice()
    {
        if(!cheese.equals("No cheese"))
        {
            switch(sizeType())
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
        else{
            return 0.0;
        }

    }


    public double getextraCheeseToppingPrice()
    {
        if(extraCheese)
        {
            switch(sizeType())
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
        else{
            return 0.0;
        }
    }

    @Override
    public double getPrice()
    {
        double extraToppingCost = getMeatToppingPrice()+ getExtraMeatToppingPrice()  + getCheeseToppingPrice() + getextraCheeseToppingPrice();
        return extraToppingCost;
    }
}
