package br.com.acmepay.adapters.output.queue;

import br.com.acmepay.adapters.requests.DocumentResquest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PublishMessageImpl implements ProducerMessage{

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void publish(DocumentResquest documentResquest) {
        log.info("Publishing document: {}", documentResquest);
        this.rabbitTemplate.convertSendAndReceive("queue_check_document", documentResquest.getDocumentNumber());
        log.info("Published document: {}", documentResquest);

    }
}
