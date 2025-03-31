package oop.sessions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//           Task1

        Passport passport = new Passport();
        passport.id = 1;
        passport.firstName = "Tramp";
        passport.lastName = "Donald";
        passport.yearOfBirth = 1960;
        passport.gender = "Male";
        passport.countryOfBirth = "USA";

        System.out.println("Id:" + passport.id);
        System.out.println("FirstName:" + passport.firstName);
        System.out.println("LastName:" + passport.lastName);
        System.out.println("Year:" + passport.yearOfBirth);
        System.out.println("Gender:" + passport.gender);
        System.out.println("Country:" + passport.countryOfBirth);


//        Task2,3

        Student student1 = new Student();
        student1.name = "Luiza";
        student1.age = 38;
        student1.group = "JS";

        Student student2 = new Student();
        student2.name = "Elnura";
        student2.age = 20;
        student2.group = "Java";

        Student student3 = new Student();
        student3.name = "Baitenir";
        student3.age = 18;
        student3.group ="JS";

        Student student4 = new Student();
        student4.name = "Sanjar";
        student4.age = 18;
        student4.group = "JS";

        Student student5 = new Student();
        student5.name = "Nurpazyl";
        student5.age = 18;
        student5.group = "Java";

        Student [] students = {student1,student2,student3,student4,student5};
        int countJava = 0;
        int countJS = 0;
        int totalAge = 0;
        for (Student student: students) {
            if (student.group.equals("Java")) {
                countJava++;
            } else if (student.group.equals("JS")){
                countJS++;
            }
            totalAge += student.age;
        }

        double averageAge = totalAge / (double) students.length;

        System.out.println("Count Java: " + countJava);
        System.out.println("Count JS: " + countJS);
        System.out.println("Средний возраст всех студентов: " + averageAge);

//        Task 4
        Scanner scanner = new Scanner(System.in);
        Seasons seasons = new Seasons();


        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        seasons.getSeason(month);

//        Task 5

        Flower flower1 = new Flower();
        flower1.flowerName = "Orhideya";
        flower1.freshness = 5;
        flower1.price = 30.00;

        Flower flower2 = new Flower();
        flower2.flowerName = "Podsnejnik";
        flower2.freshness = 3;
        flower2.price = 3.50;

        Flower flower3 = new Flower();
        flower3.flowerName = "Roza";
        flower3.freshness = 6;
        flower3.price = 10.05;

        Flower flower4 = new Flower();
        flower4.flowerName = "Lavanda";
        flower4.freshness = 7;
        flower4.price = 15.00;


        Flower [] flowers ={flower1,flower2,flower3,flower4 };
        double maxPrice = flowers [0].price;
        for (Flower flower : flowers) {
            if (flower.price > maxPrice) {
                maxPrice =flower.price;
            }
        }
        System.out.println("Самая дорогая цена: " + maxPrice);
        for (int i = 0; i < flowers.length - 1; i++) {
            for (int j = i + 1; j < flowers.length; j++){
                if ( flowers[i].freshness > flowers[j].freshness){
                    Flower temperatura = flowers[i];
                    flowers[i] =flowers [j];
                    flowers[j] = temperatura;
                }
            }
        }
        System.out.println("\nЦветы по свежести: ");
        for (Flower flower : flowers) {
            System.out.println(flower.flowerName + " - Cвежесть: " + flower.freshness);
        }


    }

}

