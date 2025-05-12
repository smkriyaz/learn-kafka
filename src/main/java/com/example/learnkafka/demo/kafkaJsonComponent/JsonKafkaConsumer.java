package com.example.learnkafka.demo.kafkaJsonComponent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.learnkafka.demo.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

	//Here deserialization occurs , Here json whatever we have in topic na that would be converted into java object
	@KafkaListener(topics = "smkriyazjson", groupId = "myGroup")
	public void consume(User user) {
		System.out.println(user);
	}

}
