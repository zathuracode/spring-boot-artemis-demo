package com.vobi.artemis.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class DispatcherService {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${jms.topic}")
	String jmsTopic;
		
	public void sendMessage(String message) {
		//jmsTemplate.setPubSubDomain(true);
		jmsTemplate.convertAndSend(jmsTopic, message);
	}
}
