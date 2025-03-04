package com.gihub.netroforge.opentelemetry_inspector.controller.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenTelemetryDataPointsItem {

	@JsonProperty("timeUnixNano")
	private String timeUnixNano;

	@JsonProperty("asDouble")
	private int asDouble;

	@JsonProperty("attributes")
	private List<OpenTelemetryAttributesItem> attributes;

	@JsonProperty("startTimeUnixNano")
	private String startTimeUnixNano;

	@JsonProperty("min")
	private int min;

	@JsonProperty("max")
	private int max;

	@JsonProperty("bucketCounts")
	private List<String> bucketCounts;

	@JsonProperty("count")
	private String count;

	@JsonProperty("sum")
	private int sum;

	@JsonProperty("explicitBounds")
	private List<Integer> explicitBounds;

	@JsonProperty("negative")
	private OpenTelemetryNegative openTelemetryNegative;

	@JsonProperty("positive")
	private OpenTelemetryPositive openTelemetryPositive;

	@JsonProperty("zeroCount")
	private String zeroCount;
}