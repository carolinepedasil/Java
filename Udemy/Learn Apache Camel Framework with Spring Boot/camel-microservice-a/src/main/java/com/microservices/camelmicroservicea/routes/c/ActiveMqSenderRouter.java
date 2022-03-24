package com.microservices.camelmicroservicea.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		//timer
		from("timer:active-mq-timer?timer=10000") //10 segundos
		.transform().constant("My message for Active MQ")
		.log("${body}")
		.to("activemq:my-activemq-queue");
		//queue
		
	}

}
