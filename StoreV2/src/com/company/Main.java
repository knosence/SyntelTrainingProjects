package com.company;

public class Main {

    public static void main(String[] args) {


        Store walmart = new Store();
        Products Cup = new Products("Cups", 2);
        Products bag = new Products("Bags", 1);
        Products plates = new Products("Plates", 3);
        Products charcoal = new Products("Charcoal", 12);
        Products mug = new Products("mugs", 1.2);

        walmart.addItemToInventory(Cup, 16);
        walmart.addItemToInventory(bag, 20);
        walmart.addItemToInventory(plates, 14);
        walmart.addItemToInventory(charcoal, 30);
        walmart.addItemToInventory(mug, 9);

        Products apple = new Products("Apples", .99);
        Products orange = new Products("oranges", .99);
        Products pear = new Products("Pears", 1);
        Products banana = new Products("Bananas", .89);
        Products grape = new Products("Grapes", .62);

        walmart.addItemToInventory(apple, 10);
        walmart.addItemToInventory(orange, 0);
        walmart.addItemToInventory(pear, 2);
        walmart.addItemToInventory(banana, 8);
        walmart.addItemToInventory(grape, 11);


        Products hammer = new Products("Hammers", 1);
        Products drill = new Products("Drills", 1);
        Products nail = new Products("Nails", 1);
        Products screwdriver = new Products("Screwdrivers", 1);
        Products ratchet = new Products("Ratchet", 1);

        walmart.addItemToInventory(hammer, 3);
        walmart.addItemToInventory(drill, 40);
        walmart.addItemToInventory(nail, 32);
        walmart.addItemToInventory(screwdriver, 0);
        walmart.addItemToInventory(ratchet, 43);




    }
}
