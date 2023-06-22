package com.example.pracvice_1.repository;
import com.example.pracvice_1.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    List<Customer> findAll();

    Customer add(Customer customer);

    Customer findById(int id);
}