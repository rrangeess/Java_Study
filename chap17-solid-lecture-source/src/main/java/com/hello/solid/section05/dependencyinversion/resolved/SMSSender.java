package com.hello.solid.section05.dependencyinversion.resolved;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송: " + message);
    }
}
