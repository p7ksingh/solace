package com.dtcc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class SolaceProducer {

	@Autowired
	StreamBridge streamBridge;
	
	public void sendMessage() {
		
		streamBridge.send("producer-out-0","say Hello! to sendMessage method");
	}
	
}
