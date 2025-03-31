package modifiers;

public class Circle {
    public static final double PI = 2.2; // Новый PI
    private double radius;

    // Конструктор для установки радиуса
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения радиуса
    public double getRadius() {
        return radius;
    }

    // Статический метод для вычисления площади
    public static double area(double radius) {
        return PI * (radius * radius);
    }

    // Статический метод для вычисления длины окружности
    public static double circumference(double radius) {
        return PI * 2 * radius;
    }
}
