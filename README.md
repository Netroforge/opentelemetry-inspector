Example cURL to send metrics:
```shell
curl --location 'http://localhost:4318/v1/metrics' \
--header 'Content-Type: application/json' \
--data '{
    "resourceMetrics": [
        {
            "resource": {
                "attributes": [
                    {
                        "key": "service.name",
                        "value": {
                            "stringValue": "my.service"
                        }
                    }
                ]
            },
            "scopeMetrics": [
                {
                    "scope": {
                        "name": "my.library",
                        "version": "1.0.0",
                        "attributes": [
                            {
                                "key": "my.scope.attribute",
                                "value": {
                                    "stringValue": "some scope attribute"
                                }
                            }
                        ]
                    },
                    "metrics": [
                        {
                            "name": "my.counter",
                            "unit": "1",
                            "description": "I am a Counter",
                            "sum": {
                                "aggregationTemporality": 1,
                                "isMonotonic": true,
                                "dataPoints": [
                                    {
                                        "asDouble": 5,
                                        "startTimeUnixNano": "1544712660300000000",
                                        "timeUnixNano": "1544712660300000000",
                                        "attributes": [
                                            {
                                                "key": "my.counter.attr",
                                                "value": {
                                                    "stringValue": "some value"
                                                }
                                            }
                                        ]
                                    }
                                ]
                            }
                        },
                        {
                            "name": "my.gauge",
                            "unit": "1",
                            "description": "I am a Gauge",
                            "gauge": {
                                "dataPoints": [
                                    {
                                        "asDouble": 10,
                                        "timeUnixNano": "1544712660300000000",
                                        "attributes": [
                                            {
                                                "key": "my.gauge.attr",
                                                "value": {
                                                    "stringValue": "some value"
                                                }
                                            }
                                        ]
                                    }
                                ]
                            }
                        },
                        {
                            "name": "my.histogram",
                            "unit": "1",
                            "description": "I am a Histogram",
                            "histogram": {
                                "aggregationTemporality": 1,
                                "dataPoints": [
                                    {
                                        "startTimeUnixNano": "1544712660300000000",
                                        "timeUnixNano": "1544712660300000000",
                                        "count": 2,
                                        "sum": 2,
                                        "bucketCounts": [
                                            1,
                                            1
                                        ],
                                        "explicitBounds": [
                                            1
                                        ],
                                        "min": 0,
                                        "max": 2,
                                        "attributes": [
                                            {
                                                "key": "my.histogram.attr",
                                                "value": {
                                                    "stringValue": "some value"
                                                }
                                            }
                                        ]
                                    }
                                ]
                            }
                        },
                        {
                            "name": "my.exponential.histogram",
                            "unit": "1",
                            "description": "I am an Exponential Histogram",
                            "exponentialHistogram": {
                                "aggregationTemporality": 1,
                                "dataPoints": [
                                    {
                                        "startTimeUnixNano": "1544712660300000000",
                                        "timeUnixNano": "1544712660300000000",
                                        "count": 3,
                                        "sum": 10,
                                        "scale": 0,
                                        "zeroCount": 1,
                                        "positive": {
                                            "offset": 1,
                                            "bucketCounts": [
                                                0,
                                                2
                                            ]
                                        },
                                        "min": 0,
                                        "max": 5,
                                        "zeroThreshold": 0,
                                        "attributes": [
                                            {
                                                "key": "my.exponential.histogram.attr",
                                                "value": {
                                                    "stringValue": "some value"
                                                }
                                            }
                                        ]
                                    }
                                ]
                            }
                        }
                    ]
                }
            ]
        }
    ]
}'
```

Example cURL to send traces:
```shell
curl --location 'http://localhost:4318/v1/traces' \
--header 'Content-Type: application/json' \
--data '{
    "resourceSpans": [
        {
            "resource": {
                "attributes": [
                    {
                        "key": "service.name",
                        "value": {
                            "stringValue": "my.service"
                        }
                    }
                ]
            },
            "scopeSpans": [
                {
                    "scope": {
                        "name": "my.library",
                        "version": "1.0.0",
                        "attributes": [
                            {
                                "key": "my.scope.attribute",
                                "value": {
                                    "stringValue": "some scope attribute"
                                }
                            }
                        ]
                    },
                    "spans": [
                        {
                            "traceId": "5B8EFFF798038103D269B633813FC60C",
                            "spanId": "EEE19B7EC3C1B174",
                            "parentSpanId": "EEE19B7EC3C1B173",
                            "name": "I'\''m a server span",
                            "startTimeUnixNano": "1544712660000000000",
                            "endTimeUnixNano": "1544712661000000000",
                            "kind": 2,
                            "attributes": [
                                {
                                    "key": "my.span.attr",
                                    "value": {
                                        "stringValue": "some value"
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        }
    ]
}'
```

Example cURL to send logs:
```shell
curl --location 'http://localhost:4318/v1/logs' \
--header 'Content-Type: application/json' \
--data '{
    "resourceLogs": [
        {
            "resource": {
                "attributes": [
                    {
                        "key": "service.name",
                        "value": {
                            "stringValue": "my.service"
                        }
                    }
                ]
            },
            "scopeLogs": [
                {
                    "scope": {
                        "name": "my.library",
                        "version": "1.0.0",
                        "attributes": [
                            {
                                "key": "my.scope.attribute",
                                "value": {
                                    "stringValue": "some scope attribute"
                                }
                            }
                        ]
                    },
                    "logRecords": [
                        {
                            "timeUnixNano": "1544712660300000000",
                            "observedTimeUnixNano": "1544712660300000000",
                            "severityNumber": 10,
                            "severityText": "Information",
                            "traceId": "5B8EFFF798038103D269B633813FC60C",
                            "spanId": "EEE19B7EC3C1B174",
                            "body": {
                                "stringValue": "Example log record"
                            },
                            "attributes": [
                                {
                                    "key": "string.attribute",
                                    "value": {
                                        "stringValue": "some string"
                                    }
                                },
                                {
                                    "key": "boolean.attribute",
                                    "value": {
                                        "boolValue": true
                                    }
                                },
                                {
                                    "key": "int.attribute",
                                    "value": {
                                        "intValue": "10"
                                    }
                                },
                                {
                                    "key": "double.attribute",
                                    "value": {
                                        "doubleValue": 637.704
                                    }
                                },
                                {
                                    "key": "array.attribute",
                                    "value": {
                                        "arrayValue": {
                                            "values": [
                                                {
                                                    "stringValue": "many"
                                                },
                                                {
                                                    "stringValue": "values"
                                                }
                                            ]
                                        }
                                    }
                                },
                                {
                                    "key": "map.attribute",
                                    "value": {
                                        "kvlistValue": {
                                            "values": [
                                                {
                                                    "key": "some.map.key",
                                                    "value": {
                                                        "stringValue": "some value"
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        }
    ]
}'
```