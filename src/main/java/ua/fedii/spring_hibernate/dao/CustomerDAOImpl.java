package ua.fedii.spring_hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.fedii.spring_hibernate.entity.Customer;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        Session currentSession = sessionFactory.getCurrentSession();

        List<Customer> customers = currentSession.createQuery("From Customer").getResultList();

        return customers;
    }
}
