package br.com.acmepay.adapters.output.kafka.topics;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicsConfiguration {

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("createAccount")
                .partitions(1)
                .build();
    }

}
