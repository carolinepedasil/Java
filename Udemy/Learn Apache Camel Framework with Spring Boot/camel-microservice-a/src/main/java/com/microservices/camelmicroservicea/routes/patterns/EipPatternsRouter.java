package com.microservices.camelmicroservicea.routes.patterns;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class EipPatternsRouter extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		//Pipeline
		//Content Based Routing - choice()
		//Multicast
		
//		from("timer:multicast?period=10000")
//		.multicast()
//		.to("log:1", "log:2");
		
		from("file:files/csv")
		.unmarshal().csv()
		.split(body()) //1 input que é divido em várias mensagens e enviado para a fila
		.to("activemq:split-queue");
		
	}
}
