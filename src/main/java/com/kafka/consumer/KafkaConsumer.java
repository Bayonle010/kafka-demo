package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "bayo", groupId = "myGroup")
    public void consumeMessage(String message){
        log.info("Consuming message from bayo Topic:: {}", message);
    }


}
