package com.kafka.parent.business.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.binder.PartitionSelectorStrategy;
import org.springframework.util.ObjectUtils;

/**
 * 决定message发送到哪个partition的策略
 *
 * @author zj2626
 * @name CustomPartitionSelectorClass
 * @description
 * @create 2020-10-19 10:12
 **/
public class CustomPartitionSelectorClass implements PartitionSelectorStrategy {
    Logger logger = LoggerFactory.getLogger(CustomPartitionSelectorClass.class);

    @Override
    public int selectPartition(Object key, int partitionCount) {
        int partition = 0;
        if (!ObjectUtils.isEmpty(key)) {
            partition = Math.abs(key.hashCode()) % partitionCount;
        }
        return partition;
    }
}
