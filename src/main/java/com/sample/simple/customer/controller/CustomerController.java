package com.sample.simple.customer.controller;

import com.sample.simple.customer.dto.request.CustomerRequestDto;
import com.sample.simple.customer.dto.response.CustomerResponseDto;
import com.sample.simple.customer.service.CustomerService;
import com.sample.simple.domain.Customer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{id}")
    public ModelAndView getCustomerById(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("custInfo");
        Customer customer = customerService.getCustomerById(id);
        mav.addObject("customer", new CustomerResponseDto(customer));
        mav.setStatus(HttpStatus.OK);
        return mav;
    }

    /**
     *
     * @param requestDto
     * @return if is not valid then 404 ERROR Page
     */
    @PostMapping("/emailCheck")
    public ModelAndView emailCheck(@Valid @RequestBody CustomerRequestDto requestDto) {
        ModelAndView mav = new ModelAndView("main");
        mav.setStatus(HttpStatus.OK);
        return mav;
    }
}
