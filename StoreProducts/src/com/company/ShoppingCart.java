package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ShoppingCart(ArrayList products) {

        this.products = products;
    }

    public void addItem(Product product, Product[] storeProductsList, int[] productInventoryList){
        products.add(product);
        int index;
        for(int i =0; i < storeProductsList.length; i++){
            if(storeProductsList[i].equals(product)){
                index = i;
                productInventoryList[index] -=1;
            }
        }
    }

    public void removeItem(Product product, Product[] storeProductsList, int[] productInventoryList){
        products.remove(product);
        int index;
        for(int i = 0; i < storeProductsList.length; i++){
            if(storeProductsList[i].equals(product)) {
                index = i;
                productInventoryList[index] +=1;
            }
        }
    }

}
