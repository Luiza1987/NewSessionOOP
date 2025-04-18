
import db.Database;
import enums.HouseType;
import models.Agency;
import models.Customer;
import models.House;
import service.AgencyService;
import service.CustomerService;
import service.HouseService;
import service.serviceImpl.AgencyServiceImpl;
import service.serviceImpl.CustomerServiceImpl;
import service.serviceImpl.HouseServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgencyService agencyService = new AgencyServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        HouseService houseService = new HouseServiceImpl();

        // Добавление агентства в базу
        agencyService.addAgency(new Agency(1, "Agency", "Vostok5", LocalDate.of(2000,
                2, 2)));

        // Добавление дома в агентство
       houseService.addHouseToAgency(new House(2, "Asanbay 5 St. 12", 50000, 3, HouseType.VILLA,
                false, "Kyrgyzstan"));

        //выбор действий
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Список:");
            System.out.println("1. Регистрация");
            System.out.println("2. Login");
            System.out.println("3. Добавить дом");
            System.out.println("4. Получить дом по типу");
            System.out.println("5. Delete House");
            System.out.println("6. Exit");
            System.out.println("Выберите действие:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Регистрация пользователя
                    System.out.print("Введите ID агентства для регистрации: ");
                    long agencyId = scanner.nextLong();
                    scanner.nextLine();
                    String registrationMessage = customerService.register(agencyId);
                    if (registrationMessage != null) {
                        System.out.println(registrationMessage);
                    } else {
                        System.out.println("Регистрация прошла успешно!.");
                    }
                    break;

                case 2:
                    // Вход в систему
                    String loginMessage = customerService.login();
                    if (loginMessage != null) {
                        System.out.println(loginMessage);
                    } else {
                        System.out.println("Вход успешен!");
                    }
                    break;

                case 3:
                    // Добавление дома
                    System.out.print("Введите ID агентства для добавления дома: ");
                    long agencyIdForHouse = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Введите адрес дома: ");
                    String address = scanner.nextLine();
                    System.out.print("Введите цену дома: ");
                    int price = scanner.nextInt();
                    System.out.print("Введите количество комнат: ");
                    int rooms = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите страну дома: ");
                    String country = scanner.nextLine();
                    House newHouse = new House(2, address, price, rooms, HouseType.VILLA, false, country);
                    houseService.addHouseToAgency(newHouse);
                    System.out.println("Дом успешно добавлен.");
                    break;

                case 4:
                    // Получение дома по типу
                    System.out.print("Введите ID агентства, чтобы получить дома: ");
                    long agencyIdForGetHouse = scanner.nextLong();
                    scanner.nextLine();  // consume the newline character
                    System.out.print("Введите House type (VILLA, COTTAGE, APARTMENT, TOWNHOUSE): ");
                    String houseTypeStr = scanner.nextLine();
                    // Получаем все дома типа VILLA для агентства с ID 1
                    House[] villas = houseService.getHouseByHouseType(1, HouseType.VILLA);
                    for (House villa : villas) {
                        if (villa != null) {
                            System.out.println(villa);
                        }
                    }

                case 5:
                    // Удаление дома
                    System.out.print("Введите ID дома, чтобы удалить: ");
                    long houseId = scanner.nextLong();
                    houseService.deleteHouseById(houseId);
                    System.out.println("Дом удалён.");
                    break;

                case 6:
                    // Выход из программы
                    System.out.println("Выход ...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Неверный выбор! Пожалуйста, попробуйте снова.");
                    break;
            }
        }

        // Вывод информации об агентствах, клиентах и домах
        System.out.println("Все агентства с клиентами и домами:");
        for (Agency agency : Database.agencies) {
            if (agency != null) {
                System.out.println(agency);
                System.out.println("Клиенты в агентстве: ");
                for (Customer customer : agency.getCustomers()) {
                    if (customer != null) {
                        System.out.println(customer);
                    }
                }
                System.out.println("Дома в агентстве: ");
                for (House houseInAgency : agency.getHouses()) {
                    if (houseInAgency != null) {
                        System.out.println(houseInAgency);
                    }
                }
            }
        }

        }
}
