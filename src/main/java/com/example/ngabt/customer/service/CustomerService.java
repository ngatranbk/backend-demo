package com.example.ngabt.customer.service;

import com.example.ngabt.customer.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomerList();
    public Customer getCustomerById(Long id);
    public String createCustomer(Customer customer);
    public String deleteCustomerById(Long id);
}
