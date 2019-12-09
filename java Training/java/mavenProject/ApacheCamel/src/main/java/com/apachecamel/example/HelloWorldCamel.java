package com.apachecamel.example;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;


//It is a integration api for legacy api's...for deprecated api's
public class HelloWorldCamel {

	public static void main(String[] args) {

		//creating an instance for camel context
		CamelContext context = new DefaultCamelContext();
		
		//Creating an instance for router
		HelloWorldRouter router = new HelloWorldRouter();
		
		
		try {
			
			//adding router to context
			context.addRoutes(router);
			
			//starting the camel context
			context.start();
			
			//producer template
			ProducerTemplate producerTemplate = context.createProducerTemplate();
			producerTemplate.sendBody("direct:start", "This msg send by producer");
			
			//consumer template
			ConsumerTemplate consumerTemplate = context.createConsumerTemplate();
			String msg = consumerTemplate.receiveBody("seda:end", String.class);
			System.out.println(msg);
			//stopping the camel context
			context.stop();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
