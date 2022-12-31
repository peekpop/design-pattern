package com.assuse.koala.singleton;

import com.assuse.koala.pattern.create.singleton.HungrySingleton;
import com.assuse.koala.pattern.create.singleton.LazySingleton;

/**
 * @Author: www.assuse.com
 * @company:
 * @link www.assuse.com
 * @Date: Created in 14:23 2018/6/7
 * @Description: 单子模式测试
 */
public class SingtonPattern {
    public static void main(String[] args) {
        HungrySingleton singleton_one = HungrySingleton.getSingleton();
        HungrySingleton singleton_two = HungrySingleton.getSingleton();
        if (singleton_one.equals(singleton_two)) {
            System.out.println("HungrySingleton ----------> 相等");
        } else {
            System.out.println("HungrySingleton ----------> 不相等");
        }
        LazySingleton lazySingleton_one = LazySingleton.getSingleton();
        LazySingleton lazySingleton_two = LazySingleton.getSingleton();
        if (lazySingleton_one.equals(lazySingleton_two)) {
            System.out.println("LazySingleton ----------> 相等");
        } else {
            System.out.println("LazySingleton ----------> 不相等");
        }
    }
}
