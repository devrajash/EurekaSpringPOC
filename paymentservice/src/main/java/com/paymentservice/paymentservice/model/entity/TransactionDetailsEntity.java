package com.paymentservice.paymentservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class TransactionDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String paymentMode;
    private int bookingId;
    private String upiId;
    private String cardNumber;

}
