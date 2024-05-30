package com.pluralsight.models;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cashier
{

    private String customerName;
    private  String orderDateTime;

    private List<Order> orders;


    public Cashier(String customerName,  String orderDateTime) {
        this.customerName = customerName;
        this.orderDateTime =  orderDateTime;;
        this.orders = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDateTime()
    {
        return orderDateTime;
    }

    public void add(Order order)
    {
        orders.add(order);
    }

    public void remove(Order order)
    {
        orders.remove(order);
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public void displayTopping()
    {
        System.out.println();
        System.out.println();
        System.out.println(("*").repeat(50));
        System.out.println();
        System.out.println((" ").repeat(20) + "CheckOut:");
        System.out.println();
        System.out.println(("*").repeat(50));

        System.out.println((" ").repeat(20) + "Order Summary:");

        for (Order order : orders)
        {
            if (order instanceof Sandwich)
            {
                System.out.println();
                Sandwich sandwich = (Sandwich) order;
                System.out.printf("%d'' %s Sandwich                    %.2f \n", sandwich.getSizeType(), sandwich.getMeatType(), sandwich.getPrice());
                sandwich.displayTopping();
                System.out.println();
            } else if (order instanceof Drinks)
            {
                System.out.println();
                Drinks drink = (Drinks) order;
                System.out.printf("Drink (Size: %s)                    %.2f \n", drink.getDrinkSize(), drink.getPrice());
                System.out.println();
            } else if (order instanceof Chips)
            {
                System.out.println();
                Chips chips = (Chips) order;
                System.out.printf("Chips (Type: %s)                    %.2f \n", chips.isType() ? "With Chips" : "No Chips", chips.getPrice());
                System.out.println();
            }

        }
        System.out.println("-".repeat(50));
        System.out.println("Total Cost " + " ".repeat(30) + getPrice());
        System.out.println();
        System.out.println();
    }





    public double getPrice()
    {
        double totalCost = 0.0;

        for (Order order : orders)
        {
            totalCost += order.getPrice();
        }


        return totalCost;
    }
}
