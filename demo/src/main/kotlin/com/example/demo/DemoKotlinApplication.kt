package com.example.demo

import org.springframework.beans.factory.getBeansOfType
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Flux
import java.util.function.Supplier

@SpringBootApplication
class DemoKotlinApplication

fun main(args: Array<String>) {

    val applicationContextInitializer = ApplicationContextInitializer<GenericApplicationContext> { gac ->
        gac.registerBean(ApplicationRunner::class.java, Supplier<ApplicationRunner> {
            ApplicationRunner {
                gac.getBeansOfType<CustomerService>().values.toTypedArray().forEach { println(it) }
            }
        })
    }
    val beans = beans {
        bean<SecondCustomerService>()
        bean<FirstCustomerService>()
        bean {
            router {
                GET("/hi") {
                    ok().body(Flux.just("Hello, world!"))
                }
            }
        }
    }
    SpringApplicationBuilder()
            .sources(DemoKotlinApplication::class.java)
            .initializers(applicationContextInitializer, beans)
            .run(*args)
}