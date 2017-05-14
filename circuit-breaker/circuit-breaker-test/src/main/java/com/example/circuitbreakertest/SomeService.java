package com.example.circuitbreakertest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public int generateNumberTwoAsFallbackForOne() {
        return 2;
    }

    @HystrixCommand(fallbackMethod = "generateNumberTwoAsFallbackForOne")
    public int generateNumberOne() {
        if (Math.random() > 0.5) {
            throw new RuntimeException("Error!");
        }
        return 1;
    }

}
