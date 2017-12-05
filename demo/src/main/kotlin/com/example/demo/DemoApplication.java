package com.example.demo;

import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Log
@SpringBootApplication
public class DemoApplication {
/*
    private static ApplicationContextInitializer<GenericApplicationContext> beans = gc -> {
        boolean registerFirstCS = true;
        if (registerFirstCS) {
            gc.registerBean(FirstCustomerService.class);
        }
        gc.registerBean(ApplicationRunner.class, () -> args -> {
            log.info ( "registering beans!");
            Map<String, CustomerService> services = gc.getBeansOfType(CustomerService.class);
            services.values().forEach(x -> log.info(x.toString()));
        }, (BeanDefinitionCustomizer) beanDefinition -> {
            log.info("initializing:" + (beanDefinition.getBeanClassName()));
        });
        gc.registerBean(RouterFunction.class, () -> route(GET("/hi"), req -> ok().body(Flux.just("Hello, world"), String.class)));
        gc.registerBean(ReactiveMongoTemplate.class, () -> new ReactiveMongoTemplate(gc.getBean(ReactiveMongoDatabaseFactory.class)));
        gc.registerBean(SecondCustomerService.class, () -> new SecondCustomerService(gc.getBean(ReactiveMongoTemplate.class)));
    };*/
/*
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DemoApplication.class)
                .initializers(beans)
                .run(args);

    }*/
}

