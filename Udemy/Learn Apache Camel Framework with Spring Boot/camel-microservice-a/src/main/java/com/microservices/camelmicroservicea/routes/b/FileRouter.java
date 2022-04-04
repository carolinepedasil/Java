package com.microservices.camelmicroservicea.routes.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:files/input") //pastas em que os arquivos estarão
		.routeId("Files-Input-Route")
		.transform().body(String.class) //transformar o body em uma string
		.choice()
			.when(simple("${file:ext} == 'xml'"))
				.log("XML FILE") //body
			.when(simple("${body} contains 'USD'"))
				.log("Not an XML FILE BUT contains USD") //body
			.otherwise()
				.log("Not an XML FILE") //body
		.end()
//		.log("${body}")
		.log("${messageHistory} ${file:absolute.path}")
		.to("file:files/output"); //será movido para esta pasta
	}

}
