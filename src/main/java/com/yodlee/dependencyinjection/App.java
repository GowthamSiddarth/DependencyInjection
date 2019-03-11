package com.yodlee.dependencyinjection;

import com.yodlee.dependencyinjection.consumer.Consumer;
import com.yodlee.dependencyinjection.consumer.ConsumerApplication;
import com.yodlee.dependencyinjection.serviceinjector.EmailServiceInjector;
import com.yodlee.dependencyinjection.serviceinjector.MessageServiceInjector;
import com.yodlee.dependencyinjection.serviceinjector.SMSServiceInjector;

public class App {
    public static void main(String[] args) {
        String message = "This is message";
        String emailRecepient = "gothsiddu@gmail.com";
        String smsRecepient = "******0446";

        MessageServiceInjector messageServiceInjector = null;
        Consumer consumer = null;

        messageServiceInjector = new EmailServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessage(message, emailRecepient);

        messageServiceInjector = new SMSServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessage(message, smsRecepient);
    }
}
