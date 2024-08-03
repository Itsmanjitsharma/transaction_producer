package com.app.transaction_producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.app.transaction_producer.entity.Transaction;

@Service
public class TransactionProducerService {
    
    @Value("${topic}")
    String Topic;

    @Autowired
    public KafkaTemplate<String,Transaction> kafkaTemplate;

    public void produce(Transaction transaction){
        kafkaTemplate.send(Topic, transaction);
    }

}
