package com.singleton;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 13:49 2018/6/7
 * @Description: 单子模式之饿汉式
 * 饿汉式不管以后用不用这个对象，我们一开始就创建这个对象的实例，
 * 需要的时候就返回已创建好的实例对象，所以比较饥饿，故此叫饿汉式单例。
 */
public class HungrySingleton {
    /**
     * 1.类的内部创建实例
     */
    private static final HungrySingleton singleton = new HungrySingleton();

    /**
     * 2.私有化构造器
     */
    private HungrySingleton() {
    }

    /**
     * 3.获取实例
     *
     * @return
     */
    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
