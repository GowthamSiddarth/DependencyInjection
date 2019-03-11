package com.yodlee.dependencyinjection.service;

public class SMSService implements MessageService {
    public void sendMessage(String message, String recepient) {
        System.out.println("sms sent (" + message + ") to " + recepient);
    }
}
