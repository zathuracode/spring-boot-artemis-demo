package com.vobi.artemis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vobi.artemis.demo.service.DispatcherService;

@RestController
public class MessageController {

	@Autowired
	private DispatcherService dispatcherService;
	
	@PostMapping(value = "/send-queue")
	public ResponseEntity<String> send(@RequestBody String message){
		dispatcherService.sendMessage(message);
		return new ResponseEntity<>("Message sent:"+message,HttpStatus.OK);
	}
	
}
