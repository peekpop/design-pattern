package com.factory;

import com.factory.factory.MailFactory;
import com.factory.factory.Provider;
import com.factory.service.Sender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 13:27 2018/6/7
 * @Description: 工厂方法模板测试
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Provider provider = new MailFactory();
        Sender produce = provider.produce();
        produce.send();
    }
}
