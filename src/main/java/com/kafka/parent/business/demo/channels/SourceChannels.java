package com.kafka.parent.business.demo.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 定义stream输出通道,不同的通道可以指定不同的topic
 *
 * @author zj2626
 * @name SourceChannels
 * @description
 * @create 2020-07-17 10:36
 **/
public interface SourceChannels {

    String DEMO_MESSAGE_CONSUMER_OUTPUT = "demoMessageConsumerOutput";

    @Output(DEMO_MESSAGE_CONSUMER_OUTPUT)
    MessageChannel canelMessageReportConsumerOutput();
}
