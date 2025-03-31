package polymorphism.session;

public class Calculator extends MyPhone {

    // Метод для сложения двух чисел
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания двух чисел
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения двух чисел
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления двух чисел
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            return 0;
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(""" 
                *******************************************
                        Это калькулятор.
                *******************************************
                """);
    }
}
