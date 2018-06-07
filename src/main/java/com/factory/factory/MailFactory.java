package com.factory.factory;

import com.factory.service.Sender;
import com.factory.service.impl.MailSender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 13:35 2018/6/7
 * @Description: 邮件发送工厂
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
