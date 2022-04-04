package com.microservices.camelmicroserviceb.routes;

import java.math.BigDecimal;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.camelmicroserviceb.CurrencyExchange;

@Component
public class MessageReceiverRouter extends RouteBuilder {
	
	@Autowired
	private MyCurrencyExchangeProcessor myCurrencyExchangeProcessor;
	
	@Autowired
	private MyCurrencyExchangeTransformer myCurrencyExchangeTransformer;
	
	@Override
	public void configure() throws Exception {
		
		//JSON
		//CurrencyExchange (Exemplo)
		//{ "id": 1000, "from": "USD", "INR", "conversionMultiple": 70}
		
//		from("activemq:my-activemq-queue")
//		//mapeando para um bean específico é chamado de "unmarshal"
//		.unmarshal()
//		.json(JsonLibrary.Jackson, CurrencyExchange.class)
//		.bean(myCurrencyExchangeProcessor)
//		.bean(myCurrencyExchangeTransformer) //transformation
//		.to("log:received-message-from-active-mq"); //a cada 10 segundos receberá uma mensagem
		
		from("kafka:my-kafka-xml-queue")
		.unmarshal()
		.jacksonXml(CurrencyExchange.class)
		.to("log:received-message-from-kafka-mq");
		
	}
	
}

@Component
class MyCurrencyExchangeProcessor {
	
	//pode fazer qualquer processing aqui
	
	Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);
	
	public void processMessage(CurrencyExchange currencyExchange) {
		
		logger.info("Do some procesing with currencyExchange.getConversionMultiple() value which is",
				currencyExchange.getConversionMultiple());
		
	}

}

@Component
class MyCurrencyExchangeTransformer {
	
	//pode fazer qualquer processing aqui
	
	Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);
	
	public CurrencyExchange processMessage(CurrencyExchange currencyExchange) {
		
		currencyExchange.setConversionMultiple(currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN));
		
		return currencyExchange;
		
	}

}