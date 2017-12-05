package com.example.demo;

import lombok.ToString;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@ToString
//@Component
public class SecondCustomerService implements CustomerService {

    private final ReactiveMongoTemplate template;

    SecondCustomerService(ReactiveMongoTemplate template) {
        this.template = template;
    }
}
