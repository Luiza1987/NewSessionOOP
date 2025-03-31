package abstraction;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        // Периметр квадрата
        return 4 * side;
    }
}
