package com.springboot.learningspringboot.service.impl;

import com.springboot.learningspringboot.dto.PaymentRequest;
import com.springboot.learningspringboot.dto.PaymentResponse;
import com.springboot.learningspringboot.entity.PaymentEntity;
import com.springboot.learningspringboot.repository.PaymentRepository;
import com.springboot.learningspringboot.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public PaymentResponse getPaymentDetailsById(PaymentRequest paymentRequest) {

        PaymentEntity paymentEntity = paymentRepository.getPaymentById(paymentRequest);

        // map it to Response Object
        return mapModelToResponseDTO(paymentEntity);
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity) {
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(paymentEntity.getPaymentId());
        paymentResponse.setPaymentAmount(paymentEntity.getPaymentAmount());
        paymentResponse.setPaymentCurrency(paymentEntity.getPaymentCurrency());
        return paymentResponse;
    }
}
