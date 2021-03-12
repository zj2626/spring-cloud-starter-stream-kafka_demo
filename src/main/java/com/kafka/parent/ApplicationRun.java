package com.kafka.parent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.elasticsearch.parent.*"})
@EnableConfigurationProperties
public class ApplicationRun {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationRun.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationRun.class).run(args);
    }
}
