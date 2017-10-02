package com.ajoz.foundit.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {
        "file:${user.dir}/conf/app.properties" }, ignoreResourceNotFound = true)
public class FoundItApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Object[] { FoundItConfiguration.class }, args);
    }
}
