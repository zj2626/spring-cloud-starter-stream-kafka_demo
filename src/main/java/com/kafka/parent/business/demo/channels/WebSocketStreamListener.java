package com.kafka.parent.business.demo.channels;

import com.alibaba.fastjson.JSON;
import com.kafka.parent.business.demo.entity.MDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;


@EnableBinding(SinkChannels.class)
public class WebSocketStreamListener {

    Logger logger = LoggerFactory.getLogger(WebSocketStreamListener.class);

    @StreamListener(SinkChannels.DEMO_MESSAGE_CONSUMER_INPUT)
    public void receiveMessageKafka(Message<MDemo> message) {
        MDemo sendReq = message.getPayload();
        logger.info("参数信息接收: 通道:[{}] 接收数据:{}", SinkChannels.DEMO_MESSAGE_CONSUMER_INPUT, JSON.toJSONString(sendReq));
        try {
            // 业务处理
        } catch (Exception e) {
            logger.error(SinkChannels.DEMO_MESSAGE_CONSUMER_INPUT + "消费异常:{}, {}", e.getMessage(), sendReq, e);
        }
    }
}
