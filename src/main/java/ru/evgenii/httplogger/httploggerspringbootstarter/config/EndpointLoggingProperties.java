package ru.evgenii.httplogger.httploggerspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "endpoint.logging")
public record EndpointLoggingProperties(boolean active) {}
