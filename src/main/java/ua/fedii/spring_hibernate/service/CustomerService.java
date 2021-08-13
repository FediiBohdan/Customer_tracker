package ua.fedii.spring_hibernate.service;

import ua.fedii.spring_hibernate.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomers(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomers(String theSearchName);
}
