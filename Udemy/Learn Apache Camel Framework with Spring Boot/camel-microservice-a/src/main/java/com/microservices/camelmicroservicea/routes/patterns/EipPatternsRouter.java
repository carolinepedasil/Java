package com.microservices.camelmicroservicea.routes.patterns;

import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EipPatternsRouter extends RouteBuilder {
	
	@Autowired
	SplitterComponent splitter;
	
	@Override
	public void configure() throws Exception {
		//Pipeline
		//Content Based Routing - choice()
		//Multicast
		
//		from("timer:multicast?period=10000")
//		.multicast()
//		.to("log:1", "log:2");
		
//		from("file:files/csv")
//		.unmarshal().csv()
//		.split(body()) //1 input que é divido em várias mensagens e enviado para a fila
//		.to("activemq:split-queue");
		
		//Message, Message2, Message3
		from("file:files/csv")
		.convertBodyTo(String.class)
		//.split(body(), ",")
		.split(method(splitter))
		.to("activmq:split-queue");
		
	}
}

@Component
class SplitterComponent{
	public List<String> splitInput(String body){
		return List.of("ABC", "DEF", "GHI"); //exemplo
	}
}