package com.assuse.factory.factory;

import com.assuse.factory.service.Sender;
import com.assuse.factory.service.impl.SmsSender;

/**
 * @Author: www.assuse.com
 * @company:
 * @Date: Created in 13:35 2018/6/7
 * @Description: 消息发送工厂
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
