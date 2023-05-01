package org.example.Products;

public class Cheese extends Dairy implements FatContent {
    private String type;
    private int fatContent;
    public Cheese(String name, String location, String type, int fatContent) {
        super(name, location);
        this.type = type;
        this.fatContent = fatContent;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getFatContent() {
        return fatContent;
    }
    @Override
    public void fat() {
        System.out.println("The fat content of " + getName() + " cheese" + " is " + fatContent + "%");
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Fat content: " + getFatContent() + "%");
    }
}
