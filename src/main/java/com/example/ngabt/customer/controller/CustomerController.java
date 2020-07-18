package com.example.ngabt.customer.controller;

import com.example.ngabt.customer.model.Customer;
import com.example.ngabt.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomerList() {
        return customerService.getCustomerList();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomerById(@PathVariable Long id) {
        return customerService.deleteCustomerById(id);
    }
}
