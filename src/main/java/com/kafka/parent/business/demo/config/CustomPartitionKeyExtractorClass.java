package com.kafka.parent.business.demo.config;

import com.kafka.parent.business.demo.entity.MDemo;
import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;

/**
 * 从Message中提取partition key的策略
 * * 如果返回null,则kafka获取 spring.cloud.stream.bindings.output.producer.partitionKeyExpression 值
 *
 * @author zj2626
 * @name CustomPartitionSelectorClass
 * @description
 * @create 2020-10-19 10:12
 **/

public class CustomPartitionKeyExtractorClass implements PartitionKeyExtractorStrategy {

    @Override
    public Object extractKey(Message<?> message) {
        Object obj = message.getPayload();
        if (obj instanceof MDemo) {
            MDemo consumeBo = (MDemo) obj;
            return consumeBo.getId();
        }
        return null;
    }

}