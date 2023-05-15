package org.example;

public enum ButterType {
    SALTED("Salted", 1.99, 250) {
        @Override
        public void spread() {
            System.out.println("This butter is easy to spread.");
        }
    },
    UNSALTED("Unsalted", 2.49, 250) {
        @Override
        public void spread() {
            System.out.println("This butter is harder to spread.");
        }
    };

    private final String name;
    private final double price;
    private final int weight;

    ButterType(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return price * weight / 1000.0;
    }

    public abstract void spread();
}

