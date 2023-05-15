package org.example;

public enum MilkType {
    SKIMMED("Skimmed", 0.1, 1000, 0.1),
    SEMI_SKIMMED("Semi-Skimmed", 0.2, 1000, 0.2),
    WHOLE("Whole", 0.3, 1000, 0.3);

    private final String name;
    private final double price;
    private final int quantity;
    private final double fatContent;

    MilkType(String name, double price, int quantity, double fatContent) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.fatContent = fatContent;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public double getFatContent() {
        return this.fatContent;
    }
    @Override
    public String toString() {
        return this.name + " Milk";
    }
}
