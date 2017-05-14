package com.example.circuitbreakertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class CircuitBreakerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerTestApplication.class, args);
	}
}
