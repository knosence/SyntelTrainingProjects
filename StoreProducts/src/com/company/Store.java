package com.company;

public class Store {


    private Product[] storeProductsList;
    private int[] productInventoryList;

    public Store(Product[] storeProductsList, int[] productInventoryList){
        this.productInventoryList = productInventoryList;
        this.storeProductsList = storeProductsList;
    }

    public Product[] getStoreProductsList() {
        return storeProductsList;
    }

    public static void getItems(Product[] product){
        for(int i =0; i < product.length; i++){
            System.out.println(product[i].getProductName());
        }
    }

    public static void getInventoryforItems(Product[] products, int[] inventory){
        for(int i = 0; i < products.length; i++){
            System.out.println(products[i].getProductName()+ " " +inventory[i]);
        }
    }
}
