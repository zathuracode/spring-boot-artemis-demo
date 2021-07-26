package com.vobi.artemis.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {

	private final static Logger log=LoggerFactory.getLogger(ReceiverService.class);
	
	@JmsListener(destination = "${jms.queue}")
	public void reciveMessage(String message) {
		log.info("Recevived Message:{}",message);
	}
	
	
}
