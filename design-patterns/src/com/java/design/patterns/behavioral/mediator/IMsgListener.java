package com.java.design.patterns.behavioral.mediator;


public interface IMsgListener {

    void messageReceived(String msg);

    String getName();

    void sendMessage(String msg);

    void sendMessage(String clientName,
                     String msg);
}
