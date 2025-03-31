package crud;

import java.time.LocalDate;
import java.util.Arrays;

import java.time.LocalDate;
import java.util.Arrays;

// CRUD - acronim methoddordun jyiyndycy;
// C - Create -> dannyi tuzup beret bazaga saktait //add // save
// R - Read -> saktalgan dannayidy chygaryp beret
// U - Update -> bazada saktalgan dannayidy ozgortup beret
// D - Delete -> bazada bar dannyidy ochurot

public class Customer {
    private long ID;
    private String firstName;
    private String gmail;
    private LocalDate localDate;
    private String phone;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // CREATE
    public Customer[] createCustomer(Customer[] customers, Customer customer) {
        Customer[] newCustomers = new Customer[customers.length + 1];

        for (int i = 0; i < customers.length; i++) {
            newCustomers[i] = customers[i];
        }

        newCustomers[customers.length] = customer;
        return newCustomers;
    }

    // GET ALL
    public Customer[] getAllCustomers(Customer[] customers) {
        return customers;
    }

    // GET BY ID
    public Customer getById(long id, Customer[] customers) {
        for (Customer customer : customers) {
            if (id == customer.getID()) {
                return customer;
            }
        }
        return null;
    }

    // UPDATE
    public Customer[] updateCustomerById(long ID, Customer[] customers, Customer updateCustomer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getID() == ID) {
                customers[i].setFirstName(updateCustomer.getFirstName());
                customers[i].setGmail(updateCustomer.getGmail());
                customers[i].setPhone(updateCustomer.getPhone());
                customers[i].setLocalDate(updateCustomer.getLocalDate());
                return customers;
            }
        }
        System.out.println("Customer with ID " + ID + " not found.");
        return customers;
    }

    // DELETE
    public Customer[] deleteCustomerById(long ID, Customer[] customers) {
        int index = -1;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getID() == ID) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Customer with ID " + ID + " not found.");
            return customers;
        }

        Customer[] newCustomers = new Customer[customers.length - 1];

        for (int i = 0, j = 0; i < customers.length; i++) {
            if (i != index) {
                newCustomers[j++] = customers[i];
            }
        }

        return newCustomers;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "\nID= " + ID +
                "\nFirst Name = " + firstName +
                "\nGmail = " + gmail +
                "\nLocal Date = " + localDate +
                "\nPhone = " + phone;
    }
}

