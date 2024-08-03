package com.app.transaction_producer.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Transaction {
    int transactionId;
    long cardNumber;
    double amount;
    Timestamp timestamp;
    int merchantId;
}
