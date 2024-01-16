package com.ameda.kevin.wikimedia.consumer.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "media-topic",groupId = "myGroup")
    public void consumeMessage(String message){
        log.info(String.format("Consuming message::%s",message));
    }
}
