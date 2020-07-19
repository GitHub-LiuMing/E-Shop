package com.liuming.eshop.controller.activemqController;

import com.liuming.eshop.service.msgService.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Description 
 * @ClassName activemqController
 * @Author 鲸落
 * @date 2020.06.17 17:03
 */
@RestController
@RequestMapping("/activemq")
public class activemqController {
    @Autowired
    private MsgProducer msgProducer;

    /*@Autowired
    private Destination destination;*/

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    /**
     * @Description 发送队列消息
     * @return java.lang.String
     * @Author 鲸落
     * @Date 2020.06.19 18:17
     */
    @RequestMapping("/send/queue")
    public String sendQueueMessage(){
        msgProducer.sendMessage(queue, "Queue: hello ActiveMQ");
        return "success";
    }

    /**
     * @Description 发送主题消息
     * @return java.lang.String
     * @Author 鲸落
     * @Date 2020.06.19 18:19
     */
    @RequestMapping("/send/topic")
    public String sendTopicMessage(){
        msgProducer.sendMessage(topic, "Topic: hello ActiveMQ");
        return "success";
    }
}
