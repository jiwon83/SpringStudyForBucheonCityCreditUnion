package com.sample.simple.domain.customer.controller;

import com.sample.simple.global.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "main";
    }

    @GetMapping("/custom-error-test")
    public ModelAndView customErrorTest() {
        throw new CustomException();
    }
}