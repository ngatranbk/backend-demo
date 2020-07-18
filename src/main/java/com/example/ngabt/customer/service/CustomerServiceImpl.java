package com.example.ngabt.customer.service;

import com.example.ngabt.customer.model.Customer;
import com.example.ngabt.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomerList() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }
        return null;
    }

    @Override
    public String createCustomer(Customer customer) {
        customerRepository.save(customer);
        return "success";
    }

    @Override
    public String deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
        return "sucess";
    }
}
