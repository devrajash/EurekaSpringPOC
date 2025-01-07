package com.paymentservice.paymentservice.service;

import org.springframework.stereotype.Service;

import com.paymentservice.paymentservice.dao.PaymentserviceDao;
import com.paymentservice.paymentservice.dto.PaymentDto;
import com.paymentservice.paymentservice.model.entity.TransactionDetailsEntity;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentserviceService {

    private final PaymentserviceDao paymentserviceDao;

    public int createTransaction(PaymentDto paymentDto) {
        TransactionDetailsEntity transactionDetailsEntity = TransactionDetailsEntity.builder()
                .bookingId(paymentDto.getBookingId())
                .cardNumber(paymentDto.getCardNumber())
                .paymentMode(paymentDto.getPaymentMode())
                .upiId(paymentDto.getUpiId())
                .build();

        paymentserviceDao.save(transactionDetailsEntity);

        return transactionDetailsEntity.getId();
    }

    public Object getTransaction(int transactionid) {
        return paymentserviceDao.findById(transactionid);
    }
}
