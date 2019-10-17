package com.assuse.factory.factory;

import com.assuse.factory.service.Sender;
import com.assuse.factory.service.impl.MailSender;
import com.assuse.factory.service.impl.SmsSender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 12:57 2018/6/7
 * @Description: 发送工厂处理类
 */
public class SimpleSendFactory {
    private static final String SMS = "sms";
    private static final String MAIL = "mail";

    /**
     * 发送邮件静态处理类
     *
     * @return
     */
    public static Sender mailSenderProduce() {
        return new MailSender();
    }

    /**
     * 发送信息静态处理类
     *
     * @return
     */
    public static Sender smsSenderProduce() {
        return new SmsSender();
    }

    /**
     * 统一测有一个生产方法
     *
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if (SMS.equals(type)) {
            return new SmsSender();
        } else if (MAIL.equals(type)) {
            return new MailSender();
        } else {
            System.out.println("请输入正确的类型....");
            return null;
        }
    }

    /**
     * 发送邮件处理类
     *
     * @return
     */
    public Sender mailProduce() {
        return new MailSender();
    }

    /**
     * 发送信息处理类
     *
     * @return
     */
    public Sender smsProduce() {
        return new SmsSender();
    }
}
