package com.liuming.eshop.service.activemqService;

import com.liuming.eshop.config.ActiveMqConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @ClassName activemqService
 * @Author 鲸落
 * @date 2020.06.17 17:10
 */
@Service
public class activemqService {
    /**
     * @Description 监听/接收队列消息
     * @param msg 消息
     * @return void
     * @Author 鲸落
     * @Date 2020.06.19 18:18
     */
    @JmsListener(destination = ActiveMqConfig.QUEUE_NAME)
    public void receiveQueueMsg(String msg){
        System.out.println("Queue收到的信息：" + msg);
    }

    /**
     * @Description 监听/接收主题消息
     * @param msg 消息
     * @return void
     * @Author 鲸落
     * @Date 2020.06.19 18:19
     */
    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME, containerFactory = "topicListenerContainer")
    public void receiveTopicMsg1(String msg) {
        System.out.println("Topic1收到的消息：" + msg);
    }

    /**
     * @Description 监听/接收主题消息
     * @param msg 消息
     * @return void
     * @Author 鲸落
     * @Date 2020.06.19 18:19
     */
    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME, containerFactory = "topicListenerContainer")
    public void receiveTopicMsg2(String msg) {
        System.out.println("Topic2收到的消息：" + msg);
    }
}
