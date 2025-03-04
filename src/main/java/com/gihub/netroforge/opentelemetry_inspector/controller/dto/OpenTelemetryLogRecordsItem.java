package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryLogRecordsItem {

    @JsonProperty("traceId")
    private String traceId;

    @JsonProperty("spanId")
    private String spanId;

    @JsonProperty("severityText")
    private String severityText;

    @JsonProperty("observedTimeUnixNano")
    private String observedTimeUnixNano;

    @JsonProperty("timeUnixNano")
    private String timeUnixNano;

    @JsonProperty("attributes")
    private List<OpenTelemetryAttributesItem> attributes;

    @JsonProperty("severityNumber")
    private int severityNumber;

    @JsonProperty("body")
    private OpenTelemetryBody openTelemetryBody;
}