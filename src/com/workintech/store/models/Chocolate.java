package com.workintech.store.models;

public class Chocolate extends ProductForSale{

    private String color;
    private boolean hasSugar;

    public Chocolate(String type, double price, String description, String color, boolean hasSugar) {
        super(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;
    }

    @Override
    public void showDetails() {
//        String productForSaleStr = super.toString();
//        productForSaleStr += toString();
        System.out.println(super.toString() + this);
        //System.out.println(super.toString() + getClass().toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        //builder.append("***CHOCOLATE*** \n");
        builder.append("Color: " + color + "\n");
        builder.append("Has Sugar: " + hasSugar + "\n");
        return builder.toString();
    }
}
