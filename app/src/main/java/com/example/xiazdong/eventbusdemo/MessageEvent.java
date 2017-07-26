package com.example.xiazdong.eventbusdemo;

/**
 * Created by xiazdong on 2017/7/26.
 */

public class MessageEvent {
    public String name;
    public int age;
    public MessageEvent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
