package com.example.collibrainterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CollibraInterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollibraInterviewApplication.class, args);
    }

}
