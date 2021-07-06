package ua.fedii.spring_hibernate.service;

import ua.fedii.spring_hibernate.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
}
