package com.sbr.rest.api.message.brokers.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReservationInput {

    /**
     * Input channel name.
     */
    String RESERVATION = "reservation";

    /**
     * @return input channel.
     */
    @Input(ReservationInput.RESERVATION)
    SubscribableChannel reservation();
}
