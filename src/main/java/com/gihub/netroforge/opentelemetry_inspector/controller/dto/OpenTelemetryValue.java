package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryValue {
    @JsonProperty("stringValue")
    private String stringValue;

    @JsonProperty("kvlistValue")
    private OpenTelemetryKvlistValue openTelemetryKvlistValue;

    @JsonProperty("arrayValue")
    private OpenTelemetryArrayValue openTelemetryArrayValue;

    @JsonProperty("doubleValue")
    private Object doubleValue;

    @JsonProperty("intValue")
    private String intValue;

    @JsonProperty("boolValue")
    private boolean boolValue;
}