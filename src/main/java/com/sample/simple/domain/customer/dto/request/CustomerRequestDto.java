package com.sample.simple.domain.customer.dto.request;

import jakarta.validation.constraints.Email;

public class CustomerRequestDto {

    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;

    public String getEmail() {
        return email;
    }

}
