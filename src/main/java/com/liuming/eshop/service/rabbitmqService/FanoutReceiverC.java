package com.liuming.eshop.service.rabbitmqService;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description 
 * @ClassName FanoutReceiverC
 * @Author 鲸落
 * @date 2020.07.10 15:15
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {
    @RabbitHandler
    public void process(Map message) {
        System.out.println("FanoutReceiverC消费者收到消息  : " +message.toString());
    }
}
