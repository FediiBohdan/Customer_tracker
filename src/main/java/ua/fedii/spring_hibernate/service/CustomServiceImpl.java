package ua.fedii.spring_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.fedii.spring_hibernate.dao.CustomerDAO;
import ua.fedii.spring_hibernate.entity.Customer;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomServiceImpl implements CustomerService{
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Customer getCustomers(int theId) {
        return customerDAO.getCustomer(theId);
    }
}
