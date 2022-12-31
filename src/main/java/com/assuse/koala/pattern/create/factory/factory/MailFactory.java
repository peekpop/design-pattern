package com.assuse.koala.pattern.create.factory.factory;

import com.assuse.koala.pattern.create.factory.service.Sender;
import com.assuse.koala.pattern.create.factory.service.impl.MailSender;

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
