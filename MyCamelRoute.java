// camel-k: dependency=mvn:org.apache.camel.springboot:camel-spring-boot-starter:3.18.6

package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyCamelRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:tick?period=1000")
            .log("Camel timer triggered");
    }
}