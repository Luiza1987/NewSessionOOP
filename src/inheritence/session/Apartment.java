package inheritence.session;

import java.util.Arrays;

public class Apartment {
    private String title;   // Название квартиры
    private int price;      // Цена квартиры
    private String address; // Адрес квартиры
    private Student[] students; // Студенты, проживающие в квартире

    // Конструктор по умолчанию
    public Apartment() {
    }

    // Конструктор с параметрами
    public Apartment(String title, int price, String address, Student[] students) {
        this.title = title;
        this.price = price;
        this.address = address;
        this.students = students;
    }

    // Геттеры и сеттеры для полей класса
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    // Метод для поиска квартиры по названию и вывода ее информации
    public void getApartment(String title, Apartment[] apartments) {
        for (Apartment apartment : apartments) {
            if (apartment.getTitle().equals(title)) {
                System.out.println("apartment = " + apartment);
                return; // Завершаем метод, если квартира найдена
            }
        }
        System.out.println("Invalid apartment"); // Если квартира не найдена
    }

    // Переопределение метода toString для вывода информации о квартире
    @Override
    public String toString() {
        return "Apartment{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
