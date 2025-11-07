package com.springboot.learningspringboot.service;

import com.springboot.learningspringboot.dto.PaymentRequest;
import com.springboot.learningspringboot.dto.PaymentResponse;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    PaymentResponse getPaymentDetailsById(PaymentRequest paymentRequest);

}
