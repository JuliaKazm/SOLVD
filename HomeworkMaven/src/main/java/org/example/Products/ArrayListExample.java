package org.example.Products;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> dairyProducts = new ArrayList<>();
        dairyProducts.add("Cheese1");
        dairyProducts.add("Butter");
        dairyProducts.add("Cheese");
        dairyProducts.add("Yogurt");
        dairyProducts.add("Milk");

        System.out.println("All dairy products: " + dairyProducts);

        String firstProduct = dairyProducts.get(0);
        System.out.println("First dairy product: " + firstProduct);

        String lastProduct = dairyProducts.get(dairyProducts.size() - 1);
        System.out.println("Last dairy product: " + lastProduct);

        String yogurt = "Yogurt";
        int yogurtIndex = dairyProducts.indexOf(yogurt);
        System.out.println("Index of yogurt: " + yogurtIndex);

        dairyProducts.set(yogurtIndex, "Greek Yogurt");
        System.out.println("All dairy products after changing yogurt to Greek Yogurt: " + dairyProducts);

        dairyProducts.remove("Cheese1");
        System.out.println("All dairy products after removing Cheese1: " + dairyProducts);

        dairyProducts.clear();
        System.out.println("All dairy products after clearing: " + dairyProducts);
    }
}
