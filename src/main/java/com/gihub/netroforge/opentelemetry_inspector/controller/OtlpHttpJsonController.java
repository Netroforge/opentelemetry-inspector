package com.gihub.netroforge.opentelemetry_inspector.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gihub.netroforge.opentelemetry_inspector.controller.dto.OpenTelemetryDataPointsItem;
import com.gihub.netroforge.opentelemetry_inspector.controller.dto.OpenTelemetryPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/otlp/http/json")
public class OtlpHttpJsonController {
    @PostMapping("/v1/traces")
    public void receiveTraces(@RequestBody OpenTelemetryDataPointsItem traceData) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        log.info("Received trace: {}", mapper.writeValueAsString(traceData));
    }

    @PostMapping("/v1/metrics")
    public void receiveMetrics(@RequestBody OpenTelemetryDataPointsItem metricData) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        log.info("Received metric: {}", mapper.writeValueAsString(metricData));
    }

    @PostMapping("/v1/logs")
    public void receiveLogs(@RequestBody OpenTelemetryPayload logData) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        log.info("Received log: {}", mapper.writeValueAsString(logData));
    }
}
