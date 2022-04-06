package com.microservices.camelmicroservicea.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestAPiConsumerRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
			
		restConfiguration().host("localhost").port(8000);
		
		from("timer:rest-api-consumer?period=1000")
		.setHeader("from",() -> "EUR") //exemplo
		.setHeader("to",() -> "INR") //exemplo
		.log("${body}")
		.to("rest:get:/currency-exchange/from/{from}/to/{to}") //exemplo
		.log("${body}");
		
	}

}