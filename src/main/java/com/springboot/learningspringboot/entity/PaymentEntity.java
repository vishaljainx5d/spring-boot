package com.springboot.learningspringboot.entity;

import lombok.Data;

@Data
public class PaymentEntity {

    private long paymentId;
    private String paymentCurrency;
    private double paymentAmount;
    private String userEmail;

}
