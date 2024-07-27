package br.com.acmepay.adapters.output.queue.service;

import br.com.acmepay.adapters.output.queue.consume.SubscribeMessageImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class FailDocumentService {

    private final SubscribeMessageImpl producerMessage;

    @Override
    void execute(String document) {
        producerMessage.subscribe(document);
        log.info("Publish successfully Check document {}", document);

    }
}
