package com.ajoz.foundit.core;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.ajoz.foundit.core"})
@EntityScan(basePackages = {"com.ajoz.foundit.core"})
@Configuration
public class FoundItConfiguration {
}
