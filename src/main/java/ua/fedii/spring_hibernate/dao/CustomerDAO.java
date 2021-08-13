package ua.fedii.spring_hibernate.dao;

import ua.fedii.spring_hibernate.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomers(String theSearchName);
}
