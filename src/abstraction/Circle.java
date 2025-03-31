package abstraction;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        // Периметр круга
        return 2 * Math.PI * radius;
    }
}