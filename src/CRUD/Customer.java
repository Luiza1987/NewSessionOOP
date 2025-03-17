package CRUD;

import java.time.LocalDate;

public class Customer {
    private long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(Long id, String firstName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //    TODO CRUD
//    TODO CREATE
    public Customer[] createCustomer(Customer[] customers, Customer customer) {
        Customer[] newCustomers = new Customer[customers.length + 1];

        for (int i = 0; i < customers.length; i++) {
            newCustomers[i] = customers[i];
        }
        newCustomers[customers.length] = customer;
        customers = newCustomers;


        System.out.println("Uspeshno saktaldy!!!");
        return newCustomers;
    }

    //    TODO CetALL
    public Customer[] getAllCustomer(Customer[] customers) {
        return customers;
    }

    //  TODO GET BY ID
    public Customer getById(long id, Customer[] customers) {
        for (Customer customer : customers) {
            if (id == customer.id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
