package com.management.asset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class AssetManangementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssetManangementApplication.class, args);
    }

}
