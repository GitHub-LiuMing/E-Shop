package com.liuming.eshop.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * @Description ActiveMQ消息配置
 * @ClassName ActiveMqConfig
 * @Author 鲸落
 * @date 2020.06.17 16:46
 */
@Configuration
public class ActiveMqConfig {
    /**
     * 点对点模式队列名称
     */
    public static final String QUEUE_NAME="activemq.queue";

    /**
     * 发布/订阅模式队列名称
     */
    public static final String TOPIC_NAME="activemq.topic";

    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue(QUEUE_NAME);
    }

    @Bean
    public ActiveMQTopic topic(){
        return new ActiveMQTopic(TOPIC_NAME);
    }

    @Bean
    public JmsListenerContainerFactory topicListenerContainer(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        // 相当于在 application.properties 中配置 spring.jms.pub-sub-domain=true
        factory.setPubSubDomain(true);
        return factory;
    }
}
