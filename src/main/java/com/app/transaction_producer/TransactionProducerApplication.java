package com.app.transaction_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.transaction_producer")
public class TransactionProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionProducerApplication.class, args);
	}

}
