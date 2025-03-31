package abstraction;

public class Rhombus extends Shape {
    private double side;

    public Rhombus(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        // Периметр ромба
        return 4 * side;
    }
}
