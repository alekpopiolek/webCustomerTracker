package com.apwaver.service;

import com.apwaver.dao.CustomerDao;
import com.apwaver.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }
}
