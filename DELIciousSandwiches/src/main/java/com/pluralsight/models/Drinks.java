package com.pluralsight.models;

public class Drinks extends OrderSize
{


    public Drinks(int sizeType) {
        super(sizeType);
    }

    @Override
    public double getSandwichSizePrice() {
        return 0;
    }

    @Override
    public double getMeatToppingPrice() {
        return 0;
    }

    @Override
    public double getExtraMeatToppingPrice() {
        return 0;
    }

    @Override
    public double getCheeseToppingPrice() {
        return 0;
    }

    @Override
    public double getextraCheeseToppingPrice() {
        return 0;
    }
}
