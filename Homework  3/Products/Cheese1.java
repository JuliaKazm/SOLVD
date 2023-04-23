package Products;

public class Cheese1 extends Shape {
        private double radius;

        public Cheese1(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

