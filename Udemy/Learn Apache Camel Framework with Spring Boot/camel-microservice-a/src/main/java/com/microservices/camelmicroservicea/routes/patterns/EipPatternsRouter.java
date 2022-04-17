package com.microservices.camelmicroservicea.routes.patterns;

import java.util.List;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EipPatternsRouter extends RouteBuilder {
	
	public class ArrayListAggregationStrategy implements AggregationStrategy {

		@Override
		public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
			// TODO Auto-generated method stub
			return null;
		}

	}

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
//		from("file:files/csv")
//		.convertBodyTo(String.class)
//		//.split(body(), ",")
//		.split(method(splitter))
//		.to("activmq:split-queue");
		
		//Aggregate
		//Messages => Aggregate => Endpoint
		//to , 3
		from("file:files/aggregate-json")
		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
		.aggregate(simple("{body.to}"), new ArrayListAggregationStrategy())
		.completionSize(3)
//		.completionTimeout(HIGHEST)
		.to("log:aggregate-json");
		
		String routingSlip = "direct:endpoint1,direct:endpoint2,direct:endpoint3";
		//String routingSlip = "direct:endpoint1,direct:endpoint2,direct:endpoint3";
		
		from("timer:routingSlip?period=10000")
		.transform().constant("My Message is Hardcoded")
		.routingSlip(simple(routingSlip));
		
		from("direct:endpoint1")
		.to("log:directendpoint1");
		
		from("direct:endpoint2")
		.to("log:directendpoint2");
		
		from("direct:endpoint3")
		.to("log:directendpoint3");
		
		
		//routing slip
		//		from("timer:multicast?period=10000")
		//		.multicast()
		//		.to("log:something1", "log:something2", "log:something3");
		
	}
}

@Component
class SplitterComponent{
	public List<String> splitInput(String body){
		return List.of("ABC", "DEF", "GHI"); //exemplo
	}
}