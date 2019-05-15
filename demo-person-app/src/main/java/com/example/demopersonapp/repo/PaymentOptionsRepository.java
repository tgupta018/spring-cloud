package com.example.demopersonapp.repo;

import com.example.demopersonapp.entity.PaymentOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentOptionsRepository extends JpaRepository<PaymentOptions,Long> {

    List<PaymentOptions> findAll();

    PaymentOptions getOne(Long id);

    PaymentOptions save(PaymentOptions paymentOptions);

    <S extends PaymentOptions> List<S> saveAll(Iterable<S> var1);

    // <S extends T> List<S> saveAll(Iterable<S> var1);
    @Query("select count(p) from PaymentOptions p")
    long countAll();
}