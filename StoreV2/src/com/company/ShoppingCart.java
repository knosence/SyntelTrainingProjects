//package com.company;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ShoppingCart extends Store {
//    private Map<Products, Integer> cart;
//
//    public ShoppingCart(){
//        cart = new HashMap<>();
//    }
//
//    public void addItemsToCart(Products key, Integer value){
//        //boolean checker = inventoryCheck(key, value);
//        if(!checker){
//            System.out.println("Can not satisfy your request");
//
//        } else {
//            if (!cart.containsKey(key)) {
//                cart.put(key, value);
//            } else {
//                for (int i = 0; i < value; i++) {
//                    cart.computeIfPresent(key, (k, v) -> v + 1);
//                }
//            }
//        }
//    }
//
//    public boolean cartItemReturnCheck(Products products, Integer qty){
//        boolean flag = true;
//        if(cart.get(products) < qty || cart.get(products) == 0) {
//            flag = false;
//        }
//        return flag;
//    }
//
//    public void removeItemsFromCart(Products key, Integer value){
//        if(cartItemReturnCheck(key, value)) {
//            if (!cart.containsKey(key)){
//                cart.put(key, value);
//            }else{
//                for(int i = 0; i < value; i++) {
//                    cart.computeIfPresent(key, (k, v) -> v + 1);
//                }
//            }
//        }else if(!cartItemReturnCheck(key, value)){
//            System.out.println("Can not satisfy your request");
//        }
//    }
//
//    public void getItems(){
//        if(cart.isEmpty()){
//            System.out.println("Nothing in cart");
//        } else{
//            System.out.println(cart.toString());
//        }
//    }
//
//}
