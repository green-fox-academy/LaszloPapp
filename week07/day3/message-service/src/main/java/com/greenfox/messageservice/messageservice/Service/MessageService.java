package com.greenfox.messageservice.messageservice.Service;

public interface MessageService {

    public void send ();

    void send(String... args) throws Exception;
}
