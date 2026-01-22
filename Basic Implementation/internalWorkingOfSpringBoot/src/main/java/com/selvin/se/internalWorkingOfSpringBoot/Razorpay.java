package com.selvin.se.internalWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue = "razorpay")
public class Razorpay implements PaymentService{
    @Override
    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Payment From: "+payment);
        return payment;

    }
}

