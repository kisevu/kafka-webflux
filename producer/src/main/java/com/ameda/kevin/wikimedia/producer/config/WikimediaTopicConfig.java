package com.ameda.kevin.wikimedia.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class WikimediaTopicConfig {

    @Bean
    public NewTopic wikiMediaTopic(){
        return TopicBuilder
                .name("media-topic")
                .build();
    }
}
