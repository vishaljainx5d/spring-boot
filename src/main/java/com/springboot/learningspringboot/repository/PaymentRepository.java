package com.springboot.learningspringboot.repository;

import com.springboot.learningspringboot.dto.PaymentRequest;
import com.springboot.learningspringboot.entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest paymentRequest) {
        return executeQuery(paymentRequest);
    }

    private PaymentEntity executeQuery(PaymentRequest paymentRequest) {
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setPaymentId(paymentRequest.getPaymentId());
        paymentEntity.setPaymentCurrency("INR");
        paymentEntity.setPaymentAmount(100.00);
        return paymentEntity;
    }
}
