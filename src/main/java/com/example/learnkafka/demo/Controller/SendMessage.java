package com.example.learnkafka.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnkafka.demo.kafkaComponents.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class SendMessage {

	@Autowired
	private KafkaProducer producer;
	
	//localhost:8080/api/v1/kafka/publish?message = hello world
	@GetMapping("/publish")
	public ResponseEntity<String>sendMessage(@RequestParam("message") String message){
		 producer.sendMessage(message);
		 return ResponseEntity.ok("message sent to topic");
		
	}
	

}
