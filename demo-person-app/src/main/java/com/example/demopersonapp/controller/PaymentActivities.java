package com.example.demopersonapp.controller;


import com.example.demopersonapp.entity.PaymentOptions;
import com.example.demopersonapp.service.impl.PaymentOptionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/payments-service")
public class PaymentActivities {

    @Autowired
    private PaymentOptionsServiceImpl paymentOptionsService;

    @GetMapping("/payment/{id}")
    public PaymentOptions getPaments(@PathVariable Long id){
        return paymentOptionsService.getPaymentOption(id);
    }


}
