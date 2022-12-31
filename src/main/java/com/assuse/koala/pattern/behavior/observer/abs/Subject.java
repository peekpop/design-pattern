package com.assuse.koala.pattern.behavior.observer.abs;

import com.assuse.koala.pattern.behavior.observer.service.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类创建
 * <p>
 * jdk类中对应：Observable类或者PropertyChangeSupport类
 */
public abstract class Subject {
    private final List<Observer> list = new ArrayList<>();

    /**
     * 添加监听
     *
     * @param observer
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 删除监听
     *
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有观察者
     *
     * @param state
     */
    public void notifyObservers(String state) {
        System.out.println("基地通知所有战队成员");
        list.forEach(t -> t.update(state));
    }

    /**
     * 状态改变抽象方法
     *
     * @param newState
     */
    public abstract void change(String newState);
}
