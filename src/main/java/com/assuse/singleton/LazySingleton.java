package com.assuse.singleton;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 13:54 2018/6/7
 * @Description: 单子模式之懒汉式(有线程安全问题)
 * 在需要单例对象的时候，才创建唯一的单例对象，以后再次调用，返回的也是第一创建的单例对象
 * 将静态成员初始化为null，在获取单例的时候才创建，故此叫懒汉式。
 */
public class LazySingleton {
    /**
     * 1.类的内部创建实例
     */
    private static LazySingleton instance = null;

    /**
     * 2.私有化构造器
     */
    private LazySingleton() {
    }

    /**
     * 3.获取实例
     *
     * @return
     */
    public static LazySingleton getSingleton() {
        if (null == instance) {
            // 解决线程不安全问题
            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
