package Products;

public class Milk extends Dairy implements FatContent {
    private int fatContent;

    public Milk(String name, String location, int fatContent) {
        super(name, location);
        this.fatContent = fatContent;
    }
    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }
    @Override
    public void fat() {
        System.out.println("The fat content of " + getName() + " milk" + " is " + fatContent + "%");
    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Fat content: " + getFatContent() + "%");
    }
}
