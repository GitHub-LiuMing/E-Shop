package com.liuming.eshop.service.rabbitmqService;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description RabbitMQ Topic直连主题型消息监听器（消费者）
 * @ClassName TopicManReceiver
 * @Author 鲸落
 * @date 2020.07.10 11:29
 */
@Component

public class TopicManReceiver {

    /**
     * 如果存在RabbitListener注册为topic.man,会循环消费（你消费一次我消费一次这种模式），但是一个消息只消费一次，不会多次消费
     */
    @RabbitHandler
    @RabbitListener(queues = "topic.man")
    public void process(Map message) {
        System.out.println("TopicManReceiver消费者收到消息  : " + message.toString());
    }
}
