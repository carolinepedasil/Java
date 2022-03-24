package com.microservices.camelmicroserviceb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.microservices.camelmicroserviceb.CurrencyExchange;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		//JSON
		//CurrencyExchange (Exemplo)
		//{ "id": 1000, "from": "USD", "INR", "conversionMultiple": 70}
		
		from("activemq:my-activemq-queue")
		//mapeando para um bean específico é chamado de "unmarshal"
		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
		
		.to("log:received-message-from-active-mq"); //a cada 10 segundos receberá uma mensagem
		
	}

}