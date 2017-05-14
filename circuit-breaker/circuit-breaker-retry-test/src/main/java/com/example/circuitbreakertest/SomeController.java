package com.example.circuitbreakertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SomeController {

    @Autowired
    private SomeService someService;

    @GetMapping
    public Integer getNumberOne() throws InterruptedException {
        return someService.generateNumberOne();
    }

}
