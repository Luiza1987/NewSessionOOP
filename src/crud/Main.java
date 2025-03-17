package crud;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//   TODO DATABASE
        Customer[] customers = new Customer[0];
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("Elnura");
        customer.setEmail("el@gmail.com");
        customer.setDateOfBirth(LocalDate.of(2004, 3,3 ));
        customer.setPhoneNumber("+996772345678");

        Customer customer1 = new Customer();
        customer1.setId(2L);
        customer1.setFirstName("Sanjar");
        customer1.setEmail("s@gmail.com");
        customer1.setDateOfBirth(LocalDate.of(2006, 3,3 ));
        customer1.setPhoneNumber("+996772345678");
//   TODO CREATE
        customer.createCustomer(customers,customer);
        customer.createCustomer(customers,customer1);

//   TODO READ

      //  getAll
        System.out.println("All Customers: " + Arrays.toString(customer.getAllCustomer(customers)));
      //  getById
        System.out.println("Get By Id Customers:  " + customer.getById(1, customers));
        }


    }

