package com.example.openfeignviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignViaCepApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignViaCepApplication.class, args);
    }

}
