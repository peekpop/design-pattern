package com.assuse.factory.service.impl;

import com.assuse.factory.service.Sender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 12:56 2018/6/7
 * @Description: 邮件发送处理类
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("邮件发送成功！");
    }
}
