package exception;

public class Cylinder {
    private double radius, height;
    private static final double PI = Math.PI;

    public Cylinder(double radius, double height) {
        validateInput(radius, height);
        this.radius = radius;
        this.height = height;
    }

    public double calculateArea() {
        return 2 * PI * radius * (height + radius);
    }

    public double calculateVolume() {
        return PI * radius * radius * height;
    }

    private void validateInput(double... values) {
        for (double value : values) {
            if (value <= 0) {
                throw new IllegalArgumentException("Ошибка: параметры должны быть положительными числами.");
            }
        }
    }
}
