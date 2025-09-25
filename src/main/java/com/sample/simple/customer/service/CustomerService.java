package com.sample.simple.customer.service;

import com.sample.simple.domain.Customer;
import com.sample.simple.customer.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerMapper customerMapper;

    public List<Customer> getAllCustomers() {
        return customerMapper.findAll();
    }

    public Customer getCustomerById(Integer id) {
        return customerMapper.findById(id);
    }

    public int addCustomer(Customer customer) {
        return customerMapper.insert(customer);
    }

    public int updateCustomer(Customer customer) {
        return customerMapper.update(customer);
    }

    public int deleteCustomer(Integer id) {
        return customerMapper.delete(id);
    }
}
