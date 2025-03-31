package abstraction;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        // Периметр прямоугольника
        return 2 * (length + width);
    }
}

