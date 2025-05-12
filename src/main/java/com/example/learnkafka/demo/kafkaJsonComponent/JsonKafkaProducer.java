package com.example.learnkafka.demo.kafkaJsonComponent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.learnkafka.demo.payload.User;

@Service
public class JsonKafkaProducer {

	private static final Logger logger = LoggerFactory.getLogger(JsonKafkaProducer.class);

	@Autowired
	private KafkaTemplate<String, User> template;

	public void sendMessage(User data) {
		// if i want to send the User entity into the topic , i need to create an object
		// for Message class
		// in this we need to set the payload(this is entity)
		// and we need to set the topic
		logger.info(data.toString());
		Message<User>message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, "smkriyazjson").build();
		template.send(message);

	}

}
