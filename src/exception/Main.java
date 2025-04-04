package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//          Class work
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the number: ");
//            int number = scanner.nextInt();
//            scanner.close();
//
//            int sqrt = (int) Math.sqrt(number);
//            if (sqrt * sqrt != number) throw new RuntimeException("Не квадрат!");
//
//            System.out.println("Квадрат числа " + sqrt);
// Home work
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Выберите фигуру (1 - Параллелепипед, 2 - Цилиндр): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Введите длину, ширину и высоту параллелепипеда: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();

                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                System.out.println("Площадь: " + parallelepiped.calculateArea());
                System.out.println("Объем: " + parallelepiped.calculateVolume());
            } else if (choice == 2) {
                System.out.println("Введите радиус и высоту цилиндра: ");
                double radius = scanner.nextDouble();
                double height = scanner.nextDouble();

                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Площадь: " + cylinder.calculateArea());
                System.out.println("Объем: " + cylinder.calculateVolume());
            } else {
                System.out.println("Ошибка: неверный выбор фигуры.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите числовые значения.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}