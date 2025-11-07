package com.springboot.learningspringboot.controller;

import com.springboot.learningspringboot.dto.PaymentRequest;
import com.springboot.learningspringboot.dto.PaymentResponse;
import com.springboot.learningspringboot.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id) {

        // map incoming data to internal request dto
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setPaymentId(id);

        // pass this internal object to further layer for processing
        PaymentResponse paymentResponse = paymentService.getPaymentDetailsById(paymentRequest);
        return ResponseEntity.ok(paymentResponse);
    }
}
