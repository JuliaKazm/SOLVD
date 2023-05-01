package org.example.Products;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Double> dairyProducts = new HashMap<>();
        dairyProducts.put("milk", 5.99);
        dairyProducts.put("yogurt", 2.49);
        dairyProducts.put("butter", 6.08);
        dairyProducts.put("cheese", 4.99);

        System.out.println("All dairy products with their prices: " + dairyProducts);

        double milkPrice = dairyProducts.get("milk");
        System.out.println("Price of milk: $" + milkPrice);

        dairyProducts.put("yogurt", 1.99);
        System.out.println("All dairy products after changing price of yogurt: " + dairyProducts);

        double totalPrice = 0.0;
        for (double price : dairyProducts.values()) {
            totalPrice += price;
        }
        System.out.println("Total price of all dairy products: $" + totalPrice);

        dairyProducts.clear();
        System.out.println("All dairy products after clearing: " + dairyProducts);
    }
}

