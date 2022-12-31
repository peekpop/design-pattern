package com.assuse.koala.pattern.behavior.observer.service;

/**
 * 观察者接口定义
 * <p>
 * jdk类中对象接口： Obsercer/PropertyChangeListener
 */
public interface Observer {

    /**
     * 每当观察对象发生更改时，都会调用此方法。
     *
     * @param state
     */
    void update(String state);
}
