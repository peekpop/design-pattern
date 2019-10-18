package com.assuse.factory.factory;

import com.assuse.factory.service.Sender;
import com.assuse.factory.service.impl.MailSender;

/**
 * @Author: www.assuse.com
 * @company:
 * @Date: Created in 13:35 2018/6/7
 * @Description: 邮件发送工厂
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
