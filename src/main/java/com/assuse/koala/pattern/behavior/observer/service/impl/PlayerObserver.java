package com.assuse.koala.pattern.behavior.observer.service.impl;

import com.assuse.koala.pattern.behavior.observer.service.Observer;

/**
 * 玩家观察者
 */
public class PlayerObserver implements Observer {
    public String state;
    public String name;

    public PlayerObserver(String name, String state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public void update(String state) {
        System.out.println("战队成员" + name + "状态更新为" + state);
    }
}
