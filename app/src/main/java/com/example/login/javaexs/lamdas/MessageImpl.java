package com.example.login.javaexs.lamdas;


public class MessageImpl implements IMessage{
    @Override
    public void sendMessage() {
        System.out.println("sending message from impl");
    }
}