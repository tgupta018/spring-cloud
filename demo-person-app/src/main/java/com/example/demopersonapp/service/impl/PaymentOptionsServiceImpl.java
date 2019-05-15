package com.example.demopersonapp.service.impl;


import com.example.demopersonapp.entity.PaymentOptions;
import com.example.demopersonapp.repo.PaymentOptionsRepository;
import com.example.demopersonapp.service.PaymentOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentOptionsServiceImpl implements PaymentOptionsService {

    @Autowired
    private PaymentOptionsRepository paymentOptionsRepository;

    @Override
    public List<PaymentOptions> findAllPaymentOptions() {
        return paymentOptionsRepository.findAll();
    }

    @Override
    public PaymentOptions getPaymentOption(Long id) {
        return paymentOptionsRepository.getOne(id);
    }

    @Override
    public PaymentOptions savePaymentOptions(PaymentOptions paymentOptions) {
        return paymentOptionsRepository.save(paymentOptions);
    }

    @Override
    public List<PaymentOptions> saveAllPaymentOptions(Iterable<PaymentOptions> var1) {
        return null;
    }

    @Override
    public long countAllPaymentOptions() {
        return paymentOptionsRepository.countAll();
    }
}
