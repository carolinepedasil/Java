package com.microservices.camelmicroservicea.routes.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:files/input") //pastas em que os arquivos estarão
		.log("${body}")
		.to("file:files/output"); //será movido para esta pasta
	}

}
