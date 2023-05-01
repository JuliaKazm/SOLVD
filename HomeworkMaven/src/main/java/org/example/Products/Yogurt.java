package org.example.Products;

public class Yogurt extends Dairy implements FatContent {
    private String flavor;
    private int fatContent;
    public Yogurt(String name, String location, String flavor, int fatContent) {
        super(name, location);
        this.flavor = flavor;
        this.fatContent = fatContent;
    }

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {

        this.flavor = flavor;
    }
    public int getFatContent() {
        return fatContent;
    }
    @Override
        public void fat() {
            System.out.println("The fat content of " + getName() + " yogurt" + " is " + fatContent + "%");
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Fat content: " + getFatContent() + "%");
    }
}

