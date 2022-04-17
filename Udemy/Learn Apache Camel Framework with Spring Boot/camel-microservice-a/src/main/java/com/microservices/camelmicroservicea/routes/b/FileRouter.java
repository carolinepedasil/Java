package com.microservices.camelmicroservicea.routes.b;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.ExchangeProperties;
import org.apache.camel.Headers;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class FileRouter extends RouteBuilder {

	@Autowired
	private DeciderBean deciderBean;
	
	@Override
	public void configure() throws Exception {
		
		//Pipeline
		
		from("file:files/input") //pastas em que os arquivos estarão
		//.pipeline()
		.routeId("Files-Input-Route")
		.transform().body(String.class) //transformar o body em uma string
		.choice() //Content Based Routing
			.when(simple("${file:ext} == 'xml'"))
				.log("XML FILE") //body
			.when(method(deciderBean))
				.log("Not an XML FILE BUT contains USD") //body
			.otherwise()
				.log("Not an XML FILE") //body
		.end()
//		.log("${body}")
//		.log("${messageHistory} ${file:absolute.path}")
		.to("file:files/output"); //será movido para esta pasta
		
		//rota direta - reusable route (rota reusável)
		from("direct://log-file-values")
		.log("${messageHistory} ${file:absolute.path}")
		.log("${file:name} {file:name.ext} {file:name.noext} {file:onlyname}")
		.log("{file:size} {file:modified}")
		.log("${routeId} ${camelId} ${body}");
	}

}


@Component
class DeciderBean {
	
	Logger logger = LoggerFactory.getLogger(DeciderBean.class);
	
	public boolean isThisConditionMet(@Body String body, 
			@Headers Map<String,String> headers,
			@ExchangeProperties Map<String,String> exchangeProperties) {
		logger.info("DeciderBean {} {} {}", body, headers, exchangeProperties); //esses valores serão printados no log
		return true;
	}
}