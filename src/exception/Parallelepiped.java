package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parallelepiped {
    private double length, width, height;

    public Parallelepiped(double length, double width, double height) {
        validateInput(length, width, height);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double calculateVolume() {
        return length * width * height;
    }

    private void validateInput(double... values) {
        for (double value : values) {
            if (value <= 0) {
                throw new IllegalArgumentException("Ошибка: параметры должны быть положительными числами.");
            }
        }
    }
}
