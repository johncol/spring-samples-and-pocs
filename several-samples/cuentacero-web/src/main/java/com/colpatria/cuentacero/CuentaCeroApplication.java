package com.colpatria.cuentacero;

import com.colpatria.cuentacero.config.SampleConfiguration;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Log
@SpringBootApplication
public class CuentaCeroApplication {

  public static void main(String[] args) {
    SpringApplication.run(CuentaCeroApplication.class, args);
  }

  @Bean
  @Autowired
  public CommandLineRunner printSampleConfiguration(SampleConfiguration sampleConfiguration) {
    return args -> {
      log.warning(sampleConfiguration.toString());
    };
  }
}
