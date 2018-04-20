package com.company;

public class Product {
    private String productName;
    private String description;
    private double price;




    public Product(String productName){
        this.productName = productName;
    }

    public Product(String productName, String description, double price){
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public String getProductName(){
        return this.productName;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }


}
