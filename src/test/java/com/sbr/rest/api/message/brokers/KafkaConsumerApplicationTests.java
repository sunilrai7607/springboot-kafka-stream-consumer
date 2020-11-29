package com.sbr.rest.api.message.brokers;

import com.sbr.rest.api.message.brokers.service.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ReservationService.class)
@ActiveProfiles("test")
class KafkaConsumerApplicationTests {

    @Test
    void contextLoads() {
    }

}
