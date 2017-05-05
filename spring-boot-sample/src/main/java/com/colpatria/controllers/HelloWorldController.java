package com.colpatria.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/hello/")
public class HelloWorldController {

    @RequestMapping("/map")
    public Map<Object, Object> map() {
        return Collections.singletonMap("message", "Hello..?");
    }

    @RequestMapping("/world")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/you")
    public String world() {
        return "Hello you!";
    }

}

class MyCustomResponse implements Serializable {
    private int status;
    private String message;
    private Object data;

    public MyCustomResponse(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyCustomResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}