package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // enum MilkType
        for (MilkType milkType : MilkType.values()) {
            System.out.println(milkType.toString() + ":");
            System.out.println("Price: " + milkType.getPrice() + " USD");
            System.out.println("Quantity: " + milkType.getQuantity() + " mL");
            System.out.println("Fat Content: " + milkType.getFatContent() + "%");
            System.out.println();
        }

        // Check if a MilkType exists
        boolean exists = MilkType.valueOf("SKIMMED") != null;
        System.out.println("Does Skimmed milk exist? " + true);
        System.out.println();

        // enum CheeseType
        System.out.println("Available Cheese Types:");
        for (CheeseType cheeseType : CheeseType.values()) {
            System.out.println("- " + cheeseType.getName() + " (" + cheeseType.getTexture() + " texture)");
            System.out.println("  Price: $" + cheeseType.getPrice() + " per " + cheeseType.getQuantity() + "g");
        }

        CheeseType selectedCheese = CheeseType.CHEDDAR;
        System.out.println("Selected Cheese: " + selectedCheese);
        System.out.println("Price: $" + selectedCheese.getPrice() + " per " + selectedCheese.getQuantity() + "g");
        System.out.println("Texture: " + selectedCheese.getTexture());
        System.out.println();

        // enum YogurtFlavors
        YogurtFlavor strawberry = YogurtFlavor.STRAWBERRY;
        YogurtFlavor vanilla = YogurtFlavor.VANILLA;
        YogurtFlavor blueberry = YogurtFlavor.BLUEBERRY;

        // Accessing the fields and methods of enum values
        System.out.println(strawberry.getName() + " yogurt costs $" + strawberry.getPrice());
        System.out.println(vanilla.getFlavorProfile() + " " + vanilla.getName() + " yogurt has " + vanilla.getQuantity() + "g in each container");
        System.out.println(blueberry.getName() + " yogurt is " + blueberry.getFlavorProfile() + " and costs $" + blueberry.getPrice());

        // Using the toString() method
        System.out.println(strawberry.toString());
        System.out.println(vanilla.toString());
        System.out.println(blueberry.toString());
        System.out.println();

        // enum ButterTypes
        System.out.println("Available butter types:");
        for (ButterType type : ButterType.values()) {
            System.out.println("- " + type.getName());
        }

        // Get the cost of 500 grams of salted butter
        ButterType saltedButter = ButterType.SALTED;
        int butterWeight = 500;
        double butterCost = saltedButter.getCost() * butterWeight / 250.0;
        System.out.printf("Cost of %d grams of %s butter: $%.2f", butterWeight, saltedButter.getName(), butterCost);

        // Spread the unsalted butter
        ButterType unsaltedButter = ButterType.UNSALTED;
        unsaltedButter.spread();
        System.out.println();

        // 5 lambda functions from the java.util.function package
        List<DairyProduct> dairyProducts = new ArrayList<>();
        dairyProducts.add(new DairyProduct("Milk", 2.99, 500));
        dairyProducts.add(new DairyProduct("Yogurt", 1.49, 200));
        dairyProducts.add(new DairyProduct("Cheese", 3.99, 300));
        dairyProducts.add(new DairyProduct("Butter", 2.79, 250));
        dairyProducts.add(new DairyProduct("Sour cream", 1.89, 150));

        // Function that converts a DairyProduct to a String
        Function<DairyProduct, String> toStringFunction = product -> product.getName() + ": $" + product.getPrice();

        // Consumer that prints a DairyProduct to the console
        Consumer<DairyProduct> printConsumer = product -> System.out.println(toStringFunction.apply(product));

        // Predicate that tests if a DairyProduct is on sale (price is less than $3)
        Predicate<DairyProduct> salePredicate = product -> product.getPrice() < 3.0;

        // BiFunction that calculates the total price of a list of DairyProducts
        BiFunction<List<DairyProduct>, Double, Double> totalPriceFunction = (products, tax) -> {
            double total = products.stream()
                    .mapToDouble(DairyProduct::getPrice)
                    .sum();
            return total + (total * (tax / 100));
        };
        System.out.println("All dairy products:");
        dairyProducts.forEach(printConsumer);

        System.out.println("Sale items:");
        List<DairyProduct> saleItems = dairyProducts.stream()
                .filter(salePredicate)
                .collect(Collectors.toList());
        saleItems.forEach(printConsumer);

        System.out.println("Total price with tax (8%): $" + totalPriceFunction.apply(dairyProducts, 8.0));

        System.out.println();

        // CustomLambda that converts a String to an Integer
        CustomLambda<String, Integer> stringToInt = (str) -> Integer.parseInt(str);
        System.out.println(stringToInt.apply("123456789"));

        // CustomLambda that converts an Integer to a Double
        CustomLambda<Integer, Double> intToDouble = (n) -> (double) n;
        System.out.println(intToDouble.apply(5));

        // CustomLambda that reverses a String
        CustomLambda<String, String> reverseString = (str) -> {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        };
        System.out.println(reverseString.apply("Diary Products"));
    }
    interface CustomLambda<T, R> {
        R apply(T t);
    }
}
