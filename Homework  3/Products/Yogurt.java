package Products;

public class Yogurt extends Dairy {
    private String flavor;

    public Yogurt(String name, String location, String flavor) {
        super(name, location);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
