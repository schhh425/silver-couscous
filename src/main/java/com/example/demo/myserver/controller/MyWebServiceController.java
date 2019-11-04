package com.example.demo.myserver.controller;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.myserver.service.WelComeServiceImpl;

@Configuration
public class MyWebServiceController {

	@Autowired
	private Bus bus;

	@Autowired
	private WelComeServiceImpl welComeService;

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, welComeService);
		endpoint.publish("/Hello");
		return endpoint;
	}
}
