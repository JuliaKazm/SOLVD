package Products;

public class Butter1 extends Shape {
    private double width;
    private double height;

    public Butter1(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
}
