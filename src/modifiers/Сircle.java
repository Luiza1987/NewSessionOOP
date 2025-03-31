package modifiers;

public class Сircle {
    private double radius;

    // Конструктор
    public void Circle(double radius) {
        this.radius = radius;
    }

    // area статик метод
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // circumference статик метод
    public static double circumference(double radius) {
        return Math.PI * 2 * radius;
    }

    // radius үчүн getter
    public double getRadius() {
        return radius;
    }

    // radius үчүн setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

