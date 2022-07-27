package com.example.demo.Service;

import com.example.demo.Constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class kafkaConsumerService {
    private final Logger logger = LoggerFactory.getLogger(kafkaConsumerService.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consume(String message) {
        logger.info("Message is already received");
    }
}
