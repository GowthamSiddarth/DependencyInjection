package com.yodlee.dependencyinjection.consumer;

public interface Consumer {
    void processMessage(String message, String recepient);
}
