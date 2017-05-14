package com.example.circuitbreakertest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class SomeService {

    @Recover
    public int generateNumberTwoAsFallbackForOne(SomeException e) {
        System.out.println("Calling fallback method at " + LocalTime.now());
        return 2;
    }

    @Retryable(include = SomeException.class, maxAttempts = 2)
    public int generateNumberOne() throws InterruptedException {
        System.out.println("Calling real method at " + LocalTime.now());
        if (Math.random() > 0.5) {
            Thread.sleep(300);
            throw new SomeException("Error!");
        }
        return 1;
    }

    public static class SomeException extends RuntimeException {
        public SomeException(String message) {
            super(message);
        }
    }

}
