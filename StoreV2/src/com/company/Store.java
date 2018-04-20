package com.company;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private Map<Products, Integer> inventory;
    private Map<Products, Integer> cart;


    public Store(){
        inventory = new HashMap<Products, Integer>();
        cart = new HashMap<Products, Integer>();
    }

    public void getCartContents(){
        System.out.println("The contents of the cart are :" + cart.);
    }
    public void getInventory(){
        System.out.println(inventory.toString());
    }

    public void inventoryItems(Products products){
        inventory.get(products);
    }

    public boolean inventoryCheck(Products products, Integer qty) {
        return inventory.get(products) < qty;
    }

    public void removeFromInventory(Products products, Integer qty){
        for(int i = 0; i > qty; i++) {
            inventory.computeIfPresent(products, (k, v) -> v + 1);
            qty--;
        }
    }

    public Map<Products, Integer> getCart(){}

    public void getNumberOfItem(Products key){
        inventory.get(key);
    }

    public void addItemToInventory(Products product, Integer qty){
        inventory.put(product, qty);
    }




}
