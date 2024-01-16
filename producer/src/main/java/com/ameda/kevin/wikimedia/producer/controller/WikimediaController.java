package com.ameda.kevin.wikimedia.producer.controller;

import com.ameda.kevin.wikimedia.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/producer/wikimedia")
public class WikimediaController {
    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping("/publish")
    public ResponseEntity<?> publish(){
        wikimediaStreamConsumer.consumerStreamAndPublish();
        return new ResponseEntity<>("successful publishing...",HttpStatus.OK);
    }
}
