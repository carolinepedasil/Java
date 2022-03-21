package com.microservices.camelmicroservicea.routes.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //importar do stereotype.Component
public class TimerRouter extends RouteBuilder {

	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	
	@Autowired
	private SimpleLoggingProcessingComponent loggingComponent;
	
	@Override
	public void configure() throws Exception {
		//timer
		//transform
		//log
		//Exchange[ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
		from("timer:first-timer") //timer endpoint - como se fosse o queue
		.log("${body}")
		.transform().constant("My Constant Message") //transformar a mensagem em constante
		.log("${body}")
//		.transform().constant("Time now is" + LocalDateTime.now())
//		.bean(getCurrentTimeBean, "getCurrentTime1")
		
		//Processing
		//Transformation
		
		.bean(getCurrentTimeBean)
		.log("${body}")
		.bean(loggingComponent)
		.log("${body}")
		.to("log:first-timer"); //mandar para o log - como se fosse o banco de dados/database
	}

}

@Component
class GetCurrentTimeBean {
	public String getCurrentTime() {
		return "Time now is" + LocalDateTime.now();
	}
}

@Component
class SimpleLoggingProcessingComponent {
	
	private Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessingComponent.class);
	
	public void process(String message) {
		
		logger.info("SimpleLoggingProcessingComponent {}", message);
		
	}
}