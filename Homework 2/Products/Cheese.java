package Products;

public class Cheese extends Dairy {
    private String type;

    public Cheese(String name, String location, String type) {
        super(name, location);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
