package com.colpatria.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Value("${name}")
    private String authorName;

    @Override
    public void printAuthorName() {
        System.out.println("The author name (loaded from the application.properties file)" + this.authorName);
    }

}
