package com.example.mysqltest.controller;

import com.example.mysqltest.persistence.MyService;
import com.example.mysqltest.persistence.SalesRecordResult;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sql")
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/test")
    public void invokeStoredProcedure() {
        myService.getAllSalesRecord();
    }

//    @Override
//    public void run(String... args) {
//        myService.getAllSalesRecord();
//    }
}