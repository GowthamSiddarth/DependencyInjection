package com.yodlee.dependencyinjection.serviceinjector;

import com.yodlee.dependencyinjection.consumer.Consumer;
import com.yodlee.dependencyinjection.consumer.ConsumerApplication;
import com.yodlee.dependencyinjection.service.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new ConsumerApplication(new SMSService());
    }
}
