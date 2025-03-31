package constructor.sessions;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

    public Student() {
        this.name = "Неизвестно";
        this.dateOfBirth = LocalDate.now();
        this.phoneNumber = "Неизвестно";
        this.nationality = "Неизвестно";
    }

    public Student(String name, LocalDate dateOfBirth, String phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    // Метод для подсчета возраста студента
    public int calculateAge() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }

    public String toString() {
        return "Name: " + name + "\nDate of Birth: " + dateOfBirth + "\nPhone Number: " + phoneNumber +
                "\nNationality: " + nationality + "\nAge: " + calculateAge() + " years\n";
      }

    }
