package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "firstTopic", groupId = "uniqueGroupId")
    void listener(String data) {
        System.out.println("Listener Received: " + data);

    }
}
