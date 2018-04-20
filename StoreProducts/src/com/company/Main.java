package com.company;

import java.util.ArrayList;

import static com.company.Store.getInventoryforItems;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> placeholderArray = new ArrayList<Product>();
        placeholderArray.add(new Product("", "", 0));
        ShoppingCart cart = new ShoppingCart(placeholderArray);


        Product table = new Product(
                "Table",
                "A horizontal surface with legs, used to hold things off the ground",
                10
        );

        Product cup = new Product(
                "Cup",
                "A small, slightly taller bucket, used to capture liquid or loose solids.",
                2
        );
        Product bag = new Product(
                "Bag",
                "Cloth material sown together to hold and contain an array of items.",
                3
        );
        Product box = new Product(
                "Box",
                "A sturdy paper like cube, used to hold and contain an array of items.",
                3
        );
        Product ladder = new Product(
                "Ladder",
                "Two sticks connected by evenly spaced smaller sticks, used for human use to climb tall items",
                10
        );
        Product glass = new Product(
                "Glass",
                "A clear sheet of clear material used in making windows",
                5
        );
        Product screws = new Product(
                "Screws",
                "A needle with raised sharp spirals running down the length, used to hold items together",
                .10
        );
        Product extensionCord = new Product(
                "Extension Cord",
                "A long plastic coated wire, used to extend a wall socket or for the application of discipline",
                9
        );
        Product wireHanger = new Product(
                "Wire Hanger",
                "A long metal rod, bent in a triangular position, used to hang clothing and is also used in the application of discipline",
                .5
        );
        Product bike = new Product(
                "Bike",
                "A machine used for transportation, usually having two wheels",
                50
        );
        Product apple = new Product(
                "Apple",
                "Red Crispy Gaia",
                3
        );
        Product bellPepper = new Product(
                "Bell Pepper",
                "Green and bigger then normal peppers",
                1.4
        );
        Product yellowOnion = new Product(
                "Yellow Onion",
                "Yellow and stinks",
                1.99
        );
        Product floridaOranges = new Product(
                "Florida Oranges",
                "Oranges... from florida",
                1.34
        );
        Product bottledWater = new Product(
                "Bottled Water",
                "Really expensive water",
                .99
        );

        Product[] storeProductsList = {
                table, cup, bag, box, ladder,
                glass, screws, extensionCord, wireHanger, bike,
                apple, bellPepper, yellowOnion, floridaOranges, bottledWater
        };

        Product[] homeImprovementProducts = {table, cup , bag, box, ladder};
        Product[] homeDepotProducts = {glass, screws, extensionCord, wireHanger, bike};
        Product[] publixProducts  = {apple, bellPepper, yellowOnion, floridaOranges, bottledWater};


        int[] productInventoryList = {
                5, 5, 5, 5, 0,
                7, 3, 7, 3, 6,
                6, 7, 4, 9, 0
        };

        int[] homeImprovementInventory = {5, 5, 5, 5, 0};
        int[] homeDepotInventory = {7, 3, 7, 3, 6};
        int[] publixInventory = {6, 7, 4, 9, 0};

        Store publix = new Store(publixProducts, publixInventory);
        Store homeDepot = new Store(homeDepotProducts, homeDepotInventory);
        Store homeImprovement = new Store(homeImprovementProducts, homeImprovementInventory);

        System.out.println();
        System.out.println(cart.getProducts().size());
        getInventoryforItems(publixProducts, publixInventory);

        cart.addItem(floridaOranges, publixProducts, publixInventory);
        getInventoryforItems(publixProducts, publixInventory);

        System.out.println(cart.getProducts().size());

        getInventoryforItems(publixProducts, publixInventory);
        cart.addItem(floridaOranges, publixProducts, publixInventory);
        getInventoryforItems(publixProducts, publixInventory);

        System.out.println(cart.getProducts().size());
    }
}

