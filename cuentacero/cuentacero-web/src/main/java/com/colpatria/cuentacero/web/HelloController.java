package com.colpatria.cuentacero.web;

import com.colpatria.cuentacero.web.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {

    private final AtomicInteger counter = new AtomicInteger(0);

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! ";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return new Greeting((long) this.counter.getAndIncrement(), "Hello " + name + "!");
    }

}
