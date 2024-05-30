package com.pluralsight.models;


public class Chips extends Order
{
    private String type;

    public Chips(String type)
    {
        this.type = type;
    }

    public String isType() {
        return type;
    }

    public double getPrice()
   {
       if ( isType().equalsIgnoreCase("Lays")
               || isType().equalsIgnoreCase("Doritos")
               || isType().equalsIgnoreCase("Cheetos")
               || isType().equalsIgnoreCase("Lays Baked")
               || isType().equalsIgnoreCase("Sun Chips")
               || isType().equalsIgnoreCase("Ruffles"))
       {
           return 1.50;
       }
       else {
           return 0.0;
       }

    }
}
