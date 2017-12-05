package com.example.demo;

import lombok.ToString;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@ToString
//@Component
public class FirstCustomerService implements CustomerService {

    private final ReactiveMongoTemplate template;

    FirstCustomerService(ReactiveMongoTemplate template) {
        this.template = template;
    }
}
