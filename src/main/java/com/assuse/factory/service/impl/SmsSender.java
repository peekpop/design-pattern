package com.assuse.factory.service.impl;

import com.assuse.factory.service.Sender;

/**
 * @Author: www.assuse.com
 * @company:
 * @Date: Created in 12:55 2018/6/7
 * @Description: 消息发送处理类
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("消息发送成功！");
    }
}
