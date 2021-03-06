package com.springboottest.carrental.customer.service;

import com.springboottest.carrental.customer.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer getById(Long id);
    void deleteById(Long id);
    List<Customer> isEmailInUse(String email);
    List<Customer> isDrivingLicenceInUse(String drivingLicence);
    List<Customer> searchCustomerByName(String text);
}
