package com.sbr.rest.api.message.brokers.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface GlobalReservationInput {

    /**
     * Input channel name.
     */
    String GLOBAL = "global";

    /**
     * @return input channel.
     */
    @Input(GlobalReservationInput.GLOBAL)
    SubscribableChannel global();
}
