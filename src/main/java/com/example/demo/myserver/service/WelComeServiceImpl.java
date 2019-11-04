package com.example.demo.myserver.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.example.demo.myserver.module.UserAccount;
import com.example.demo.myserver.module.UserInfo;

@Component
@javax.jws.WebService(serviceName = "HelloService", portName = "HelloPort", targetNamespace = "http://service.ws.sample/", endpointInterface = "com.example.demo.myserver.service.WelComeService")
public class WelComeServiceImpl implements WelComeService {

	@Override
	public UserInfo sayHello(UserAccount userAccount) {
		UserInfo userInfo = new UserInfo();
		userInfo.setAccount("8888888");
		userInfo.setBalance(new BigDecimal(0.01));
		userInfo.setUserName("苏春昊");
		return userInfo;
	}
}
