package com.pluralsight.models;

public class RegularTopping extends Topping
{
    public RegularTopping(String type) {
        super(type);
    }

    @Override
    public double getPrice() {
        return 0.0;
    }


}
