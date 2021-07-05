package ua.fedii.spring_hibernate.dao;

import ua.fedii.spring_hibernate.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
}
