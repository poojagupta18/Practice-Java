package com.apachecamel.example;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.json.simple.JsonObject;

public class JsonToXml extends RouteBuilder{
	
	CamelContext context = new DefaultCamelContext();

	@Override
	public void configure() throws Exception {

		from("direct:start").process(new Processor()
				{

					public void process(Exchange exchange) throws Exception {

						//get json
						String json = exchange.getIn().getBody(String.class);
						
						//transform json to xml
						JSONObject jsonObject = new JSONObject(json);
						String xml = XML.toString(jsonObject);
						
						//set the xml
						exchange.getOut().setBody(xml);
					}
			
				}).to("seda:end");
		
				//start the context
				context.start();
				
				String json = "{\"employee\": {\r\n" + "      \"name\": \"Pooja Gupta \",\r\n" + 			
								"   \"age\":20\r\n"+"}}";
				
				System.out.println(json);
				
				ProducerTemplate producerTemplate = context.createProducerTemplate();
				producerTemplate.sendBody("direct:start", json);

				ConsumerTemplate consumerTemplate = context.createConsumerTemplate();
				String msg = consumerTemplate.receiveBody("seda:end", String.class);
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
