package com.gihub.netroforge.opentelemetry_inspector.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import io.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest;
import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/otlp/http/proto")
public class OtlpHttpProtoController {
    @PostMapping(value = "/v1/traces", consumes = "application/x-protobuf")
    public void receiveTraces(HttpServletRequest request) throws IOException {
        byte[] body = request.getInputStream().readAllBytes();
        try {
            ExportTraceServiceRequest traceRequest = ExportTraceServiceRequest.parseFrom(body);
            log.info("Received trace: {}", traceRequest);
        } catch (InvalidProtocolBufferException e) {
            log.error("Failed to parse trace request: {}", e.getMessage());
        }
    }

    @PostMapping(value = "/v1/metrics", consumes = "application/x-protobuf")
    public void receiveMetrics(HttpServletRequest request) throws IOException {
        byte[] body = request.getInputStream().readAllBytes();
        try {
            ExportMetricsServiceRequest metricRequest = ExportMetricsServiceRequest.parseFrom(body);
            log.info("Received metric: {}", metricRequest);
        } catch (InvalidProtocolBufferException e) {
            log.error("Failed to parse metric request: {}", e.getMessage());
        }
    }

    @PostMapping(value = "/v1/logs", consumes = "application/x-protobuf")
    public void receiveLogs(HttpServletRequest request) throws IOException {
        byte[] body = request.getInputStream().readAllBytes();
        try {
            ExportLogsServiceRequest logRequest = ExportLogsServiceRequest.parseFrom(body);
            log.info("Received log: {}", logRequest);
        } catch (InvalidProtocolBufferException e) {
            log.error("Failed to parse log request: {}", e.getMessage());
        }
    }
}
