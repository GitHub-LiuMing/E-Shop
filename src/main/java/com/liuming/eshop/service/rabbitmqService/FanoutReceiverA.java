package com.liuming.eshop.service.rabbitmqService;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description 
 * @ClassName FanoutReceiverA
 * @Author 鲸落
 * @date 2020.07.10 15:13
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {
    @RabbitHandler
    public void process(Map message) {
        System.out.println("FanoutReceiverA消费者收到消息  : " +message.toString());
    }
}
