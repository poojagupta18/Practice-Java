package com.apachecamel.example;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("direct:start").to("class: com.apachecamel.example.MyService?method=doSomething");
	}

	/*
	 * @Override public void configure() throws Exception {
	 * 
	 * 
	 * System.out.println("Hello world...");
	 * from("file:C:\\Users\\Allianz\\Desktop\\java\\demo?noop=true").to(
	 * "file:C:\\Users\\Allianz\\Desktop\\java\\demo1");
	 * System.out.println("File is moved");
	 * 
	 * 
	 * from("direct:start").to("seda:end");
	 * 
	 * }
	 */
	
	

}