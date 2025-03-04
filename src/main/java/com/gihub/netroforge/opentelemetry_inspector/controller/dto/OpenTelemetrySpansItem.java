package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetrySpansItem {

	@JsonProperty("traceId")
	private String traceId;

	@JsonProperty("spanId")
	private String spanId;

	@JsonProperty("endTimeUnixNano")
	private String endTimeUnixNano;

	@JsonProperty("kind")
	private int kind;

	@JsonProperty("name")
	private String name;

	@JsonProperty("attributes")
	private List<OpenTelemetryAttributesItem> attributes;

	@JsonProperty("startTimeUnixNano")
	private String startTimeUnixNano;

	@JsonProperty("parentSpanId")
	private String parentSpanId;

	@JsonProperty("status")
	private OpenTelemetryStatus status;
}