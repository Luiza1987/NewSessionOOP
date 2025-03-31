package crud;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        // TODO DATABASE
//        // Начальный массив
//        Customer[] customers = new Customer[0];
//
//        // Класс, управляющий услугами клиентов (для вызова методов)
//        Customer customerService = new Customer();
//
//        //  Создадим новых клиентов
//        Customer c1 = new Customer();
//        c1.setID(1);
//        c1.setFirstName("Zalina");
//        c1.setGmail("z@gmail.com");
//        c1.setLocalDate(LocalDate.of(1988, 12, 16));
//        c1.setPhone("+996700112233");
//
//        Customer c2 = new Customer();
//        c2.setID(2);
//        c2.setFirstName("Aika");
//        c2.setGmail("a@gmail.com");
//        c2.setLocalDate(LocalDate.of(1994, 3, 13));
//        c2.setPhone("+996701223344");
//
//        //Добавим клиентов в массив
//        customers = customerService.createCustomer(customers, c1);
//        customers = customerService.createCustomer(customers, c2);
//
//        System.out.println("\n Все клиенты:");
//        System.out.println(Arrays.toString(customers));
//
//        // Поиск клиента по ID
//        long searchId = 2;
//        Customer foundCustomer = customerService.getById(searchId, customers);
//        if (foundCustomer != null) {
//            System.out.println("\n Найденный клиент (ID=" + searchId + "):\n" + foundCustomer);
//        } else {
//            System.out.println("\n Клиент не найден!");
//        }
//
//        //Обновление клиента
//        Customer updatedCustomer = new Customer();
//        updatedCustomer.setFirstName("Ilgiz"); // Имя изменилось
//        updatedCustomer.setGmail("i@gmail.com");
//        updatedCustomer.setLocalDate(LocalDate.of(2004, 9, 12));
//        updatedCustomer.setPhone("+996701998877");
//
//        customers = customerService.updateCustomerById(2, customers, updatedCustomer);
//        System.out.println("\n Жаңыртылган кардарлар:");
//        System.out.println(Arrays.toString(customers));
//
//        // Обновленные клиенты
//        long deleteId = 1;
//        customers = customerService.deleteCustomerById(deleteId, customers);
//        System.out.println("\n " + deleteId + "-После удаления клиента с ID:");
//        System.out.println(Arrays.toString(customers));


        // Начальный массив домов
        House[] houses = new House[0];

        // Класс обслуживания домов
        House houseService = new House();

        // Создание новых домов
        House house1 = new House();
        house1.setId(1);
        house1.setAddress("Kopernika 63");
        house1.setPrice(3000000);
        house1.setRoom(2);
        house1.setCountry("Kyrgyzstan");

        House house2 = new House();
        house2.setId(2);
        house2.setAddress("St.Manasa 21");
        house2.setPrice(25000000);
        house2.setRoom(10);
        house2.setCountry("Djalal Abad");

        // Добавление домов в массив
        houses = houseService.createHouse(houses, house1);
        houses = houseService.createHouse(houses, house2);

        System.out.println("Все дома:");
        System.out.println(Arrays.toString(houses));

        // Получить дом по ID
        long searchId = 2;
        House foundHouse = houseService.getHouseById(searchId, houses);
        if (foundHouse != null) {
            System.out.println("\nНайден дом (ID=" + searchId + "):");
            System.out.println(foundHouse);
        } else {
            System.out.println("\nДом не найден!");
        }

        // Обновить дом с ID 2
        House updatedHouse = new House();
        updatedHouse.setId(2);
        updatedHouse.setAddress("Maldybaeva 23");
        updatedHouse.setPrice(4500000);
        updatedHouse.setRoom(2);
        updatedHouse.setCountry("Bishkek");

        houses = houseService.updateHouseById(2, houses, updatedHouse);
        System.out.println("\nОбновленный дом с ID 2:");
        System.out.println(Arrays.toString(houses));

        // Удалить дом с ID 1
        long deleteId = 1;
        houses = houseService.deleteHouseById(deleteId, houses);
        System.out.println("\nДома после удаления дома с ID " + deleteId + ":");
        System.out.println(Arrays.toString(houses));
    }
}





