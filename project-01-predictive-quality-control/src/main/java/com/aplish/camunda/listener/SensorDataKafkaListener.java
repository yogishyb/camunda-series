package com.aplish.camunda.listener;

import com.aplish.camunda.dto.SensorDataDto;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class SensorDataKafkaListener {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "test-topic",groupId = "test-cg")
    public void consume(String message){
        logger.info(String.valueOf(message));
       // acknowledgment.acknowledge();
    }
}
