package com.example.pracvice_1.service;

import com.example.pracvice_1.model.Customer;
import com.example.pracvice_1.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
}