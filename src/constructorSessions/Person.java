package constructorSessions;

public class Person {
//    String firstName;
//    String lastName;
//    String  dateOfBirth;
//
//    Person(String firstName, String lastName, String  dateOfBirth) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//    }

    String name;
    int age;
    String work;
    int salary;
    int phone;

    Person(String name, int age, String work, int salary, int phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }

    public String toString() {
        return name + ": " + age + " лет;"  + " " + work + ";" + " Salary: " + salary + ";" + " phone: " + phone;
    }
}
