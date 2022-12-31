package com.assuse.koala.pattern.create.factory.service.impl;

import com.assuse.koala.pattern.create.factory.service.Sender;

/**
 * @Author: www.assuse.com
 * @company:
 * @Date: Created in 12:56 2018/6/7
 * @Description: 邮件发送处理类
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("邮件发送成功！");
    }
}
