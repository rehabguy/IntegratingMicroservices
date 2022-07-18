package com.rk.service;

import com.rk.model.Payment;
import com.rk.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment pay(Payment payment){
        payment.setStatus(paymentprocessing());
        payment.setTransactid(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    private String paymentprocessing() {
        return new Random().nextBoolean()?"Success":"false";
    }

}
