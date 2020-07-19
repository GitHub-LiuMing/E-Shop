package com.liuming.eshop.service.rabbitmqService;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description RabbitMQ Topic直连主题型消息监听器（消费者）
 * @ClassName TopicWomanReceiver
 * @Author 鲸落
 * @date 2020.07.10 11:30
 */
@Component
//@RabbitListener(queues = "topic.woman")
public class TopicWomanReceiver {
    @RabbitHandler
    @RabbitListener(queues = "topic.woman")
    public void process(Map message) {
        System.out.println("TopicWomanReceiver消费者收到消息  : " + message.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.man")
    public void process1(Map message) {
        System.out.println("1TopicWomanReceiver消费者收到消息  : " + message.toString());
    }
}
