package abstraction.session;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Работа с Laptop
        System.out.println("=== РАБОТА С LAPTOP ===");
        Device laptop = new Laptop("M2", "16");
        laptop.setId(1);
        laptop.setBrand("Apple");
        laptop.setPrice(130000);
        laptop.setColour("Gold");
        laptop.setYearOfIssue(2020);
        laptop.setOperatingSystem("MacOS");
        laptop.addDevise(laptop);
        System.out.println("All Devices" + Arrays.toString(laptop.getAllDevises()));
        System.out.println();
        System.out.println(laptop.getById(1));
        laptop.updateDevice(1, new Laptop(1, "Windows", 20000, "Windows",
                "Black", 2020, "Windows", "4"));
        System.out.println("All Devices" + Arrays.toString(laptop.getAllDevises()));
        laptop.deleteDevise(1);
        System.out.println("All Devices" + Arrays.toString(laptop.getAllDevises()));

        // Работа с Phone
        System.out.println("\n=== РАБОТА С PHONE ===");
        Device phone = new Phone("48MP", true);
        phone.setId(1);
        phone.setBrand("Samsung");
        phone.setPrice(90000);
        phone.setColour("Black");
        phone.setYearOfIssue(2023);
        phone.setOperatingSystem("Android");
        phone.addDevise(phone);

        Device phone2 = new Phone(2, "Apple 15", 120000, "iOS", "Silver",
                2023, "12MP", false);
        phone.addDevise(phone2);

        System.out.println("All Phones: " + Arrays.toString(phone.getAllDevises()));
        System.out.println();

        System.out.println("Phone by ID 1: " + phone.getById(1));
        System.out.println("Phone by ID 2: " + phone.getById(2));

        // Обновление телефона
        phone.updateDevice(2, new Phone(2, "Apple", 150000, "iOS 17",
                "Gold", 2024, "48MP", true));
        System.out.println("\nAfter Update - All Phones: " + Arrays.toString(phone.getAllDevises()));

        // Удаление телефона
        phone.deleteDevise(1);
        System.out.println("\nAfter Delete - All Phones: " + Arrays.toString(phone.getAllDevises()));
    }
}

