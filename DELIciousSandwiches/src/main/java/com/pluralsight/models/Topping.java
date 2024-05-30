package com.pluralsight.models;

public abstract class Topping
{
    String type;

    public Topping(String type)
    {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return type;
    }


    public abstract double getPrice();
}
