package com.factory.factory;

import com.factory.service.Sender;
import com.factory.service.impl.SmsSender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 13:35 2018/6/7
 * @Description: 消息发送工厂
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
