package com.kafka.parent.business.demo.channels;


import com.kafka.parent.business.demo.entity.MDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(SourceChannels.class)
public class WebSocketStreamingService {

    Logger logger = LoggerFactory.getLogger(WebSocketStreamingService.class);

    @Autowired
    private SourceChannels channels;

    @Value("${server.port}")
    private String port;

    public void sendKafka(final MDemo sendReq) {
        logger.info("参数信息下发: 通道:{} 服务端口:{}", SourceChannels.DEMO_MESSAGE_CONSUMER_OUTPUT, sendReq);
        boolean send = channels.canelMessageReportConsumerOutput().send(MessageBuilder.withPayload(sendReq).build());
        if (send) {
            logger.info(SourceChannels.DEMO_MESSAGE_CONSUMER_OUTPUT + " 下发成功！");
        }
    }
}
