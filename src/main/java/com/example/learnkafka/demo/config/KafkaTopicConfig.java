package com.example.learnkafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic leartopiccreation() {
		return TopicBuilder.name("smkriyaz").build();
	}

	@Bean
	public NewTopic leartopiccreation2() {
		return TopicBuilder.name("smkriyazjson").build();
	}

}
