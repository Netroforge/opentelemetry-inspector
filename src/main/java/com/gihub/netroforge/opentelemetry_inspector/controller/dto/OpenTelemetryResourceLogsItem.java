package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryResourceLogsItem {
    @JsonProperty("resource")
    private OpenTelemetryResource openTelemetryResource;

    @JsonProperty("scopeLogs")
    private List<OpenTelemetryScopeLogsItem> scopeLogs;
}