package br.com.acmepay.adapters.output.queue;

import br.com.acmepay.adapters.requests.DocumentResquest;

public interface ProducerMessage {

    void publish(DocumentResquest documentResquest);
}
