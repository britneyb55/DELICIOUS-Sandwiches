package com.pluralsight.models;


public class Chips extends Order
{
    private boolean type;

    public Chips(boolean type)
    {
        this.type = type;
    }

    public boolean isType() {
        return type;
    }

    public double getPrice()
   {
       if(isType())
       {
           return 1.50;
       }
       else {
           return 0.0;
       }

    }
}
