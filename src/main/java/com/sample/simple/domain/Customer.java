package com.sample.simple.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer {
    private Integer customerId;
    private String name;
    private String email;
    private String phone;
    private LocalDate registeredDate;
}
