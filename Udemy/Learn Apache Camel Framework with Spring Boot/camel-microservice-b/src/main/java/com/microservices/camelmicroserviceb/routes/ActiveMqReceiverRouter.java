package com.microservices.camelmicroserviceb.routes;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.crypto.CryptoDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.camelmicroserviceb.CurrencyExchange;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

	@Autowired
	private MyCurrencyExchangeProcessor myCurrencyExchangeProcessor;
	
	@Autowired
	private MyCurrencyExchangeTransformer myCurrencyExchangeTransformer;
	
	@Override
	public void configure() throws Exception {
		
		from("activemq:my-activemq-queue")
		.unmarshal(createEncryptor())
//		.unmarshal() //mapeando para um bean específico é chamado de "unmarshal"
//		.json(JsonLibrary.Jackson, CurrencyExchange.class)
//		.bean(myCurrencyExchangeProcessor)
//		.bean(myCurrencyExchangeTransformer) //transformation
		.to("log:received-message-from-active-mq"); //a cada 10 segundos receberá uma mensagem
		
//		from("activemq:my-activemq-xml-queue")
//		.unmarshal()
//		.jacksonXml(CurrencyExchange.class)
//		.to("log:received-message-from-active-mq");
		
//		from("activemq:split-queue")
//		.to("log:received-message-from-active-mq");
		
	}
	
	private CryptoDataFormat createEncryptor() throws KeyStoreException, IOException, NoSuchAlgorithmException,
			CertificateException, UnrecoverableKeyException {
		KeyStore keyStore = KeyStore.getInstance("JCEKS");
		ClassLoader classLoader = getClass().getClassLoader();
		keyStore.load(classLoader.getResourceAsStream("myDesKey.jceks"), "someKeystorePassword".toCharArray());
		Key sharedKey = keyStore.getKey("myDesKey", "someKeyPassword".toCharArray());
		
		CryptoDataFormat sharedKeyCrypto = new CryptoDataFormat("DES", sharedKey);
		return sharedKeyCrypto;
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