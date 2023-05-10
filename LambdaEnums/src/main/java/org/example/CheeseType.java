package org.example;

public enum CheeseType {
    CHEDDAR("Cheddar", 3.0, 250, "Hard"),
    MOZZARELLA("Mozzarella", 2.5, 200, "Soft"),
    GOUDA("Gouda", 2.8, 300, "Semi-Hard");

    private final String name;
    private final double price;
    private final int quantity;
    private final String texture;

    CheeseType(String name, double price, int quantity, String texture) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.texture = texture;
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

    public String getTexture() {
        return texture;
    }

    @Override
    public String toString() {
        return name + " Cheese";
    }
}

