package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryMetricsItem {

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("exponentialHistogram")
	private OpenTelemetryExponentialHistogram openTelemetryExponentialHistogram;

	@JsonProperty("histogram")
	private OpenTelemetryHistogram openTelemetryHistogram;

	@JsonProperty("gauge")
	private OpenTelemetryGauge openTelemetryGauge;

	@JsonProperty("sum")
	private OpenTelemetrySum openTelemetrySum;
}