package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryPayload {
    @JsonProperty("resourceMetrics")
    private List<OpenTelemetryResourceMetricsItem> resourceMetrics;

    @JsonProperty("resourceSpans")
    private List<OpenTelemetryResourceSpansItem> resourceSpans;

    @JsonProperty("resourceLogs")
    private List<OpenTelemetryResourceLogsItem> resourceLogs;
}