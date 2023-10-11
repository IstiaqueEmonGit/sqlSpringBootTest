package com.example.mysqltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class MySqlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySqlTestApplication.class, args);
    }

}
