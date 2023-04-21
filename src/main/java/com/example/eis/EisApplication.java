package com.example.eis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class EisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EisApplication.class, args);
    }

}
