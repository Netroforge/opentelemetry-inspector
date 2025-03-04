package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryExponentialHistogram {

    @JsonProperty("aggregationTemporality")
    private int aggregationTemporality;

    @JsonProperty("dataPoints")
    private List<OpenTelemetryDataPointsItem> dataPoints;
}