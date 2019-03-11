package com.yodlee.dependencyinjection.serviceinjector;

import com.yodlee.dependencyinjection.consumer.Consumer;
import com.yodlee.dependencyinjection.consumer.ConsumerApplication;
import com.yodlee.dependencyinjection.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new ConsumerApplication(new EmailService());
    }
}
