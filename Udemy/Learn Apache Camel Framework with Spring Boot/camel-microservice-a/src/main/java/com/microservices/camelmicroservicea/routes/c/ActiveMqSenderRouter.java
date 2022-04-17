package com.microservices.camelmicroservicea.routes.c;

import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.crypto.CryptoDataFormat;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder { //pode trocar o nome para JsonSenderRouter se quiser

	@Override
	public void configure() throws Exception {
		
		//timer
		from("timer:active-mq-timer?timer=10000") //10 segundos
		.transform().constant("My message for Active MQ")
		.marshal(createEncryptor())
		.to("activemq:my-activemq-queue");
		//queue
		
		//timer
//		from("file:files/json")
//		.log("${body}")
//		.to("activemq:my-activemq-queue");
		//queue
		
//		from("file:files/xml")
//		.log("${body}")
//		.to("activemq:my-activemq-xml-queue");
		
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
