package com.example.learnkafka.demo.kafkaComponents;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	//// this consumer will consumer a string value as message , so we can use string deserializer 
//	@KafkaListener(topics = "smkriyaz" , groupId = "myGroup")
//	public void consumeMessages(String messages) {
//		System.out.println(messages);
//	}
}
