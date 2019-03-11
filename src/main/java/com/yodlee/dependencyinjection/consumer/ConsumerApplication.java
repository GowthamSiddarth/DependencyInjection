package com.yodlee.dependencyinjection.consumer;

import com.yodlee.dependencyinjection.service.MessageService;

public class ConsumerApplication implements Consumer {

    private MessageService messageService;

    public ConsumerApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recepient) {
        messageService.sendMessage(message, recepient);
    }
}
