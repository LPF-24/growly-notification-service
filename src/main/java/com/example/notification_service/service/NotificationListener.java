package com.example.notification_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {
    private final Logger logger = LoggerFactory.getLogger(NotificationListener.class);

    @KafkaListener(topics = "habit-events", groupId = "notification-group")
    public void listen(String message) {
        logger.info("Received event from Kafka: {}", message);
        // в реальной системе тут была бы отправка email/уведомления
    }
}
