package org.example.Products;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> dairyProducts = new TreeSet<>();
        dairyProducts.add("milk");
        dairyProducts.add("yogurt");
        dairyProducts.add("butter");
        dairyProducts.add("cheese");

        System.out.println("All dairy products: " + dairyProducts);

        String firstProduct = dairyProducts.first();
        System.out.println("First dairy product: " + firstProduct);

        String lastProduct = dairyProducts.last();
        System.out.println("Last dairy product: " + lastProduct);

        TreeSet<String> subSet = (TreeSet<String>) dairyProducts.subSet("milk", "yogurt");
        System.out.println("Dairy products between milk and yogurt: " + subSet);

        TreeSet<String> tailSet = (TreeSet<String>) dairyProducts.tailSet("butter");
        System.out.println("Dairy products starting from butter: " + tailSet);

        boolean containsButter = dairyProducts.contains("butter");
        System.out.println("Does dairy products contain butter? " + containsButter);

        dairyProducts.remove("yogurt");
        System.out.println("All dairy products after removing yogurt: " + dairyProducts);

        dairyProducts.clear();
        System.out.println("All dairy products after clearing: " + dairyProducts);
    }
}
