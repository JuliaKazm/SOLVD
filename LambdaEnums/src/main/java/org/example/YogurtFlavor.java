package org.example;

public enum YogurtFlavor {
    STRAWBERRY("Strawberry", 1.5, 150, "Fruity"),
    VANILLA("Vanilla", 1.2, 200, "Sweet"),
    BLUEBERRY("Blueberry", 1.6, 150, "Tart");

    private final String name;
    private final double price;
    private final int quantity;
    private final String flavorProfile;

    YogurtFlavor(String name, double price, int quantity, String flavorProfile) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.flavorProfile = flavorProfile;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFlavorProfile() {
        return flavorProfile;
    }

    @Override
    public String toString() {
        return name + " Yogurt";
    }
}

