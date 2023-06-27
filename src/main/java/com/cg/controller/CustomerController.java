package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public ModelAndView showListPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/list");

        return modelAndView;
    }

    @GetMapping("/info")
    public String showInfoPage() {
        return "customer/info";
    }

    @GetMapping("/create")
    public String showCreatePage() {
        return "customer/create";
    }

}
