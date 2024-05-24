
// camel-k: dependency=mvn:org.apache.camel.springboot:camel-spring-boot-starter:3.18.6

//you must use the same spring boot starter that corresponds to your camel version.  
//To get this deploy a simple route and look in the log for "[org.apa.cam.imp.eng.AbstractCamelContext] (main) Apache Camel 3.18.6.redhat-00009 (camel-1) is starting"

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
