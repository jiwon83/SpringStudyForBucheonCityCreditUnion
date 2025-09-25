package com.sample.simple.customer.dto.response;

import com.sample.simple.domain.Customer;

public record CustomerResponseDto(int id, String name, String email) {

    public CustomerResponseDto(Customer customer) {
        this(customer.getCustomerId(), customer.getName(), customer.getEmail());
    }
}
