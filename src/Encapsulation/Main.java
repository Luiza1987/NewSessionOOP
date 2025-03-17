package Encapsulation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Class work
//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(4);
//        rectangle.setWidth(9.6);
//        double area = rectangle.getArea();
//        System.out.println("Length: = " + rectangle.getWidth());
//        System.out.println("Width: = " + rectangle.getLength());
//        System.out.println("Area: = " + area);

//        Class work

//        Scanner scanner = new Scanner(System.in);
//
//        Student student = new Student();
//
//        System.out.print("Enter the name: ");
//        student.setName(scanner.nextLine());
//
//        System.out.print("Enter the lastname: ");
//        student.setLastName(scanner.nextLine());
//
//        System.out.print("Enter the age: ");
//        student.setAge(scanner.nextInt());
//
//        System.out.print("Enter the courses: ");
//        int courseCount = scanner.nextInt();
//
//        String[] courses = new String[courseCount];
//
//        System.out.print("Введите курсы:");
//        for (int i = 0; i < courseCount; i++) {
//            courses[i] = scanner.nextLine();
//        }
//
//        student.setCourses(courses);
//
//        System.out.println("\nСтудент:");
//        System.out.println("Аты: " + student.getName());
//        System.out.println("Фамилиясы: " + student.getLastName());
//        System.out.println("Жашы: " + student.getAge());
//        System.out.print("Курсу:");
//        for (String course : student.getCourses()) {
//            System.out.println(course);
//        }

//        Home Work
        University[] universities  = {
                new University("Manas","Ch.Aitmatova-56","Kyrgyzstan"),
                new University("KGMA","Ahunbaeva-92","Kyrgyzstan"),
                new University("Harvard","Massachusetts Hall","USA"),
                new University("Tohoku","2 Chome-1-1 Katahira","Japan")
        };
        School[] schools = {
                new School("Arman", 6,"6-mkrn"),
                new School("Stalbek", 8,"Maldybaeva-23"),
                new School("Salman", 4,"5-mkrn"),
                new School("Amina", 1," Kopernika-63")
        };
        Car[] cars = {
                new Car("Lexus", "black", LocalDate.of(2017,03,25)),
                new Car("Toyota", "black", LocalDate.of(2016,06,10)),
                new Car("Subaru", "white", LocalDate.of(2022,12,30)),
                new Car("Kia", "white", LocalDate.of(2016,04,10)),
        };
        Person[] persons = {
                new Person("Eliza", 43, "Dantist"),
                new Person("Luiza", 38, "Buhgalter"),
                new Person("Zalina", 36, "Chekist, Dantist"),
                new Person("Aitbubu", 30, "Dantist")
        };

        System.out.println("Universities:");
        for (University university : universities) {
            System.out.println(university.getName() + " - Location: " + university.getLocation() +
                    " - Country: " + university.getCountry());
        }
        System.out.println("\nSchools:");
        for (School school : schools) {
            System.out.println(school.getName() + " - Classes: " + school.getClasses() +
                    " - Address: " + school.getAddress());
        }
        System.out.println("\nCars:");
        for (Car car : cars) {
            System.out.println(car.getMarka() + " - Color: " + car.getColor() + " - Dateofbirth: " + car.getDateOfBirth());
        }
        System.out.println("\nPerson:");
        for (Person person : persons) {
            System.out.println(person.getName() + " - Age: " + person.getAge() + " - Profession: " + person.getProfession());
        }

    }
}
