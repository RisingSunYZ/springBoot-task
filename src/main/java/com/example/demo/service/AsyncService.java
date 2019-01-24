package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void sayHello() throws Exception{
        Thread.sleep(5000);
        System.out.println("Hello World....");
    }

}
