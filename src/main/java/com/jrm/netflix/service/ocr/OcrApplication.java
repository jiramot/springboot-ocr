package com.jrm.netflix.service.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@AutoConfigurationPackage
@SpringBootApplication
public class OcrApplication {

  public static void main(String[] args) {
    SpringApplication.run(OcrApplication.class, args);
  }
}
