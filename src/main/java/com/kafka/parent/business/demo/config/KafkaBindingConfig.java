package com.kafka.parent.business.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zj2626
 * @name KafkaBindingConfig
 * @description
 * @create 2020-10-19 10:01
 * <p>
 * https://blog.csdn.net/huanzhulouzhu/article/details/84024151
 **/
@Configuration
public class KafkaBindingConfig {

    @Bean
    public CustomPartitionKeyExtractorClass customPartitionKeyExtractor() {
        return new CustomPartitionKeyExtractorClass();
    }

    @Bean
    public CustomPartitionSelectorClass customPartitionSelector() {
        return new CustomPartitionSelectorClass();
    }

}
