package com.assuse.factory;

import com.assuse.factory.factory.MailFactory;
import com.assuse.factory.factory.Provider;
import com.assuse.factory.service.Sender;

/**
 * @Author: www.assuse.com
 * @company:
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
