package no.java.trd.quarkus;

import org.apache.camel.builder.RouteBuilder;

public class HelloRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo?period=1s").log("Hello World");
    }
}
