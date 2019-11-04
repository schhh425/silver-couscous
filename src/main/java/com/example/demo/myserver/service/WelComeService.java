package com.example.demo.myserver.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.example.demo.myserver.module.UserAccount;
import com.example.demo.myserver.module.UserInfo;

@WebService
public interface WelComeService {
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "sayHello", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.SayHello")
	@WebMethod(action = "urn:SayHello")
	@ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.SayHelloResponse")
	UserInfo sayHello(UserAccount userAccount);
}
