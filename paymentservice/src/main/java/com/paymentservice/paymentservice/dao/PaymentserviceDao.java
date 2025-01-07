package com.paymentservice.paymentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentservice.paymentservice.model.entity.TransactionDetailsEntity;

public interface PaymentserviceDao extends JpaRepository<TransactionDetailsEntity, Integer> {

}
