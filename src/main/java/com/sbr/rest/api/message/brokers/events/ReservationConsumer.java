package com.sbr.rest.api.message.brokers.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

@Configuration
@EnableBinding(ReservationInput.class)
@Slf4j
public class ReservationConsumer {

    @StreamListener(target = ReservationInput.RESERVATION, condition = "headers['type']=='booking'")
    public void handle(String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        log.info("ReservationConsumer >>>> partition {} Received Message handler: {} ", partition, message);
    }
}
