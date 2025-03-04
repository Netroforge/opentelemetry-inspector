package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryResourceMetricsItem {

    @JsonProperty("scopeMetrics")
    private List<OpenTelemetryScopeMetricsItem> scopeMetrics;

    @JsonProperty("resource")
    private OpenTelemetryResource resource;
}