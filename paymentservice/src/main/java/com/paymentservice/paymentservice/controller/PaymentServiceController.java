package com.paymentservice.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.paymentservice.paymentservice.dto.PaymentDto;
import com.paymentservice.paymentservice.service.PaymentserviceService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
public class PaymentServiceController {

    private final PaymentserviceService paymentserviceService;

    @GetMapping("/")
    public String getMethodName() {
        return "Payment Service";
    }

    @PostMapping("/payment/transaction")
    public int postMethodName(@RequestBody PaymentDto paymentDto) {

        return paymentserviceService.createTransaction(paymentDto);
    }

    @GetMapping("/payment/transaction/{transactionid}")
    public Object getTransaction(@PathVariable int transactionid) {

        return paymentserviceService.getTransaction(transactionid);
    }

}
