package com.example.demo;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Log
@Component
public class Runner implements ApplicationRunner {

    private final CustomerService[] services;

    Runner(@Autowired(required = false) CustomerService[] s) {
        this.services = s == null ? new CustomerService[0] : s;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Arrays.asList(this.services).forEach(x -> log.info(x.toString()));
    }
}
