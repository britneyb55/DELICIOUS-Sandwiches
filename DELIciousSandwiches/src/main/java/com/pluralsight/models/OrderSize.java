package com.pluralsight.models;

import com.pluralsight.models.Interface.Cashier;

public abstract class OrderSize implements Cashier
{
    private int sizeType;

    public OrderSize(int sizeType)
    {
        this.sizeType = sizeType;
    }


    public int getSizeType()
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
}
