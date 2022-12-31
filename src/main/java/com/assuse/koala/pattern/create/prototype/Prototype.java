package com.assuse.koala.pattern.create.prototype;

import java.io.*;

/**
 * @Author: www.assuse.com
 * @company:
 * @Date: Created in 14:39 2018/6/7
 * @Description: 原型模式
 */
public class Prototype implements Cloneable {

    /**
     * 浅复制
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /**
     * 深复制
     */
    public Object deepClone() throws IOException, ClassNotFoundException {

        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
