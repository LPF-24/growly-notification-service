package com.example.notification_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @KafkaListener(topics = "habit-events", groupId = "notification-group")
    public void listen(String message) {
        System.out.println("Получено событие из Kafka: " + message);
        // в реальной системе тут была бы отправка email/уведомления
    }
}
