package com.example.demopersonapp.service;

import com.example.demopersonapp.entity.PaymentOptions;

import java.util.List;

public interface PaymentOptionsService {

    List<PaymentOptions> findAllPaymentOptions();
    PaymentOptions getPaymentOption(Long id);
    PaymentOptions savePaymentOptions(PaymentOptions paymentOptions);
    List<PaymentOptions> saveAllPaymentOptions(Iterable<PaymentOptions> var1);
    long countAllPaymentOptions();

}
