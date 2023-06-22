package com.example.pracvice_1.service;

import com.example.pracvice_1.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer add(Customer customer);

    Customer findById(int id);
}