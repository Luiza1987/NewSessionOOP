package service.serviceImpl;

import db.Database;
import enums.Gender;
import exceptions.MyException;
import models.Agency;
import models.Customer;
import service.CustomerService;

import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    int customerCount = 0;

    @Override
    public String register(long agencyId) {
        try {
            Customer customer = new Customer();
            System.out.println("Введите ваше имя: ");
            customer.setName(new Scanner(System.in).nextLine());

            // Проверка номера телефона
            System.out.println("Введите номер телефона: ");
            String phoneNumber = new Scanner(System.in).nextLine();
            switch (phoneNumber) {
                case "":
                    throw new MyException("Номер телефона не может быть пустым!");
                default:
                    if (!phoneNumber.matches("\\+996\\d{9}")) {
                        throw new MyException("Телефонный номер должен начинаться с +996 и состоять из 13 цифр.");
                    } else {
                        customer.setPhoneNumber(phoneNumber);
                    }
                    break;
            }

            // Проверка email
            System.out.println("Введите email: ");
            String email = new Scanner(System.in).nextLine();
            if (!email.contains("@")) {
                throw new MyException("Email должен содержать символ '@'");
            } else {
                customer.setEmail(email);
            }

            // Проверка пароля
            System.out.println("Введите пароль: ");
            String password = new Scanner(System.in).nextLine();
            if (password.length() < 8) {
                throw new MyException("Пароль должен быть длиной хотя бы 8 символов:");
            }
            if (!password.matches(".*[A-Z].*")) {
                throw new MyException("Пароль должен содержать хотя бы одну заглавную букву");
            }
            if (!password.matches(".*\\d.*")) {
                throw new MyException("Пароль должен содержать хотя бы одну цифру");
            }
            if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                throw new MyException("Пароль должен содержать хотя бы один специальный символ");
            }
            customer.setPassword(password);

            // Выбор пола через switch-case
            System.out.println("Укажите пол (MALE/FEMALE): ");
            String gender = new Scanner(System.in).nextLine();
            switch (gender.toUpperCase()) {
                case "FEMALE":
                    customer.setGender(Gender.FEMALE);
                    break;
                case "MALE":
                    customer.setGender(Gender.MALE);
                    break;
                default:
                    throw new MyException("Пол должен быть либо 'Male' or 'Female'");
            }

            if (Database.agencies == null)
                throw new MyException("Агентство не найдено");

            for (Agency agency : Database.agencies) {
                if (agency != null && agency.getId() == agencyId) {
                    agency.getCustomers()[customerCount++] = customer;
                    break;
                }
            }
        } catch (MyException e) {
            return "Регистрация не удалась: " + e.getMessage();
        }
        return "Регистрация прошла успешно!";
    }

    @Override
    public String login() {
        try {
            System.out.println("Введите email: ");
            String consolEmail = new Scanner(System.in).nextLine();

            System.out.println("Введите пароль: ");
            String consolPassword = new Scanner(System.in).nextLine();

            for (Agency agency : Database.agencies) {
                if (agency != null) {
                    for (Customer customer : agency.getCustomers()) {
                        if (customer != null && customer.getEmail().equals(consolEmail) && customer.getPassword().equals(consolPassword)) {
                            return "Вход выполнен успешно!";
                        }
                    }
                }
            }
            throw new MyException("Неверный email или пароль!");
        } catch (MyException e) {
            return "Ошибка входа: " + e.getMessage();
        }
    }
}