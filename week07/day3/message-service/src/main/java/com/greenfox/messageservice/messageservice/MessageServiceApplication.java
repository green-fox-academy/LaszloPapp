package com.greenfox.messageservice.messageservice;

import com.greenfox.messageservice.messageservice.Service.MessageProceeder;
import com.greenfox.messageservice.messageservice.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageServiceApplication implements MessageService{

	@Autowired
	MessageProceeder messageProceeder;

	public static void main(String[] args) {
		SpringApplication.run(MessageServiceApplication.class, args);
	}

	@Override
	public void send() {

	}

	@Override
	public void send(String... args) throws Exception {
		messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
	}

}
