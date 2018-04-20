package com.company;


public class Product {
    private String uuid;
    private String name;
    private String description;
    private double wsPrice;
    private double rPrice;
    private int qtyCount;

    public Product(String uuid, String name, String description, double wsPrice, double rPrice, int qtyCount){
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.wsPrice = wsPrice;
        this.rPrice = rPrice;
        this.qtyCount = qtyCount;

    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWsPrice() {
        return wsPrice;
    }

    public double getrPrice() {
        return rPrice;
    }

    public int getQtyCount() {
        return qtyCount;
    }

    public void fill(){
        fill(10);
    }

    public void fill(int amount){
        int newAmount = qtyCount+ amount;
        qtyCount = newAmount;
    }

}
