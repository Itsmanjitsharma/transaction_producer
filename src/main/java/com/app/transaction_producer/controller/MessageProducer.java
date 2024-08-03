package com.app.transaction_producer.controller;

import java.sql.Timestamp;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.transaction_producer.entity.Transaction;
import com.app.transaction_producer.service.TransactionProducerService;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageProducer {
    private final Logger logger = LoggerFactory.getLogger(MessageProducer.class);
    private final Random random = new Random();

    @Autowired
    TransactionProducerService transactionProducerService;

    @PostConstruct
    public void produceMessage(){
        int transactionId = random.nextInt(100000); 
        int cardNumber = random.nextInt(100000); 
        int merchantId = random.nextInt(100000); 
        int amount = random.nextInt(1000); 
        Transaction transaction = new Transaction();
        transaction.setTransactionId(transactionId);
        transaction.setCardNumber(cardNumber);
        transaction.setMerchantId(merchantId);
        transaction.setAmount(amount);
        transaction.setTimestamp(new Timestamp(System.currentTimeMillis()));
        logger.info("message produced {}:",transaction);
        transactionProducerService.produce(transaction);
    }
}
