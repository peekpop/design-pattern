package com.factory.service.impl;

import com.factory.service.Sender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 12:55 2018/6/7
 * @Description: 消息发送处理类
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("消息发送成功！");
    }
}
