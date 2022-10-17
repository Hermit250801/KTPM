package com.ontap.ontapgk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "Mai Van Truong")
    public void consumeMessage(String message) {
        logger.info("Message received from activemq queue---"+message);
    }
}
