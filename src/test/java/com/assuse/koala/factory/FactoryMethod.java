package com.assuse.koala.factory;

import com.assuse.koala.pattern.create.factory.factory.MailFactory;
import com.assuse.koala.pattern.create.factory.factory.Provider;
import com.assuse.koala.pattern.create.factory.service.Sender;

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
