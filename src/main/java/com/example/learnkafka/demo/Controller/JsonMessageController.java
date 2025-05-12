package com.example.learnkafka.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnkafka.demo.kafkaJsonComponent.JsonKafkaProducer;
import com.example.learnkafka.demo.payload.User;

@RestController
@RequestMapping("/json")
public class JsonMessageController {
  
	@Autowired
	private JsonKafkaProducer jsonproducer;
	
	@PostMapping("/sendJsonData")
	public ResponseEntity<String> sendMessage(@RequestBody User data){
		jsonproducer.sendMessage(data);
		return ResponseEntity.ok("Message Successfully sent to topic");
	}
	
}
