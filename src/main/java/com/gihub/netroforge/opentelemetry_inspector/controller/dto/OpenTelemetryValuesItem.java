package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryValuesItem {
    @JsonProperty("stringValue")
    private String stringValue;

    @JsonProperty("value")
    private OpenTelemetryValue openTelemetryValue;

    @JsonProperty("key")
    private String key;
}