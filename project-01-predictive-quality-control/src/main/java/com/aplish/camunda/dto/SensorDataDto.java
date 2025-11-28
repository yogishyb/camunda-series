package com.aplish.camunda.dto;

import io.camunda.zeebe.client.api.search.response.ProcessInstance;
import io.hypersistence.tsid.TSID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorDataDto {
    private String machineId;
    @Builder.Default
    private String tsid = new TSID.Factory().generate().toString();
    private long timestamp;
    private double temperature;
    private double vibration;
    private double pressure;


}
