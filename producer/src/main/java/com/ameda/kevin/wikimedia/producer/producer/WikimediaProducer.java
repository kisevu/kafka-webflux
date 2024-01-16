package com.ameda.kevin.wikimedia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void  sendMessage(String message){
//        log.info(String.format("sending message to media-topic::%s",message));
        kafkaTemplate.send("media-topic",message);
    }
}
