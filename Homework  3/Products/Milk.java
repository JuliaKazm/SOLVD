package Products;

public class Milk extends Dairy {
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
}
