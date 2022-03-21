package com.microservices.camelmicroservicea.routes.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component //importar do stereotype.Component
public class TimerRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//timer
		//transform
		//log
		//Exchange[ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
		from("timer:first-timer") //timer endpoint - como se fosse o queue
//		.transform().constant("My Constant Message") //transformar a mensagem em constante
		.transform().constant("Time now is" + LocalDateTime.now())
		.to("log:first-timer"); //mandar para o log - como se fosse o banco de dados/database
	}

}
