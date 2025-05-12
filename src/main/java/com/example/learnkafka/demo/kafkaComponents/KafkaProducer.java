package com.example.learnkafka.demo.kafkaComponents;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
	@Autowired 
	private KafkaTemplate<String, String> kafkaTemplate;
	// this producer will generate a string value as message , so we can use string serializer 
	public void sendMessage(String message) {
		logger.info(String.format("message sent to smkriyaz topic",message));
		kafkaTemplate.send("smkriyaz", message);
	}
	
}
