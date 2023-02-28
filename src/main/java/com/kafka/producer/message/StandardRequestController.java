package com.kafka.producer.message;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StandardRequestController {

    private KafkaTemplate<String, MessageRequest> kafkaTemplate;

    public StandardRequestController(KafkaTemplate<String, MessageRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("standard-request")
    public void publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send("standard-message", request);
    }

}
