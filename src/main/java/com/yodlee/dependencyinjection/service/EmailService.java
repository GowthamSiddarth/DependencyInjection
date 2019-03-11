package com.yodlee.dependencyinjection.service;

public class EmailService implements MessageService {
    public void sendMessage(String message, String recepient) {
        System.out.println("email sent (" + message + ") to " + recepient);
    }
}
