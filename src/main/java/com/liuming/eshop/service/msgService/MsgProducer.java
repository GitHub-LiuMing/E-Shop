package com.liuming.eshop.service.msgService;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * @Description
 * @ClassName MsgProducer
 * @Author 鲸落
 * @date 2020.06.17 16:54
 */
@Service
public class MsgProducer {
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * @Description 消息发送接口
     * @param destination 消息发送目的地
     * @param msg 消息具体内容
     * @return void
     * @Author 鲸落
     * @Date 2020.06.17 16:58
     */
    public void sendMessage(Destination destination, String msg) {
        jmsMessagingTemplate.convertAndSend(destination, msg);
    }
}
