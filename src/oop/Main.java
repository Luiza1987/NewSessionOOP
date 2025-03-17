package oop;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
//        Class work

            Car car = new Car();
            car.model = "Lexus";
            car.color = "White";
            car.price = 80000;

            System.out.println(car.model);
            System.out.println(car.color);
            System.out.println(car.price);


//        Class work

            Scanner scanner = new Scanner(System.in);
            Programmer programmer = new Programmer();

            System.out.print("Enter the name: ");
            programmer.name = scanner.nextLine();

            System.out.print("Enter the surname: ");
            programmer.surname = scanner.nextLine();

            System.out.print("Enter the age: ");
            programmer.age = scanner.nextInt();

            System.out.println("Name" + programmer.name);
            System.out.println("Surname:" + programmer.surname);
            System.out.println("Age:" + programmer.age);

            int dateOfBirth = programmer.getDateOfBirth();
            System.out.println("dateOfBirth = " + dateOfBirth);

//      Home work

            Triangle triangle = new Triangle();
            triangle.a = 4;
            triangle.b = 6;
            triangle.c = 3;

            System.out.println(" Area of the triangle: " + triangle.area()) ;

        }
    }

