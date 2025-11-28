package com.aplish.camunda.service;

import com.aplish.camunda.dto.SensorDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SensorSimulationService {
    private double baseTemp = 55.0;
    private double drift = 0.0;
    private Random random = new Random();

    @Autowired
    private KafkaTemplate<String, SensorDataDto> kafkaTemplate;


    @Scheduled(fixedRate = 100)
    public void simulate() {
        drift = random.nextDouble() * 0.02;
        double temp = baseTemp + drift + random.nextGaussian();
        double vibration = 0.5 + random.nextDouble();
        double pressure = 1.2 + random.nextDouble() * 0.2;

        if (random.nextDouble() < 0.01) {
            vibration += 5.0;
            temp += 20;
        }

        SensorDataDto sensorDataDto = SensorDataDto.builder()
                .machineId("M-1")
                .timestamp(System.currentTimeMillis())
                .temperature(temp)
                .vibration(vibration)
                .pressure(pressure)
                .build();

        kafkaTemplate.send("test-topic","M-1",sensorDataDto);

    }
}
