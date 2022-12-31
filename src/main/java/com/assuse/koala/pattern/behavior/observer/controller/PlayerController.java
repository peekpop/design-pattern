package com.assuse.koala.pattern.behavior.observer.controller;

import com.assuse.koala.pattern.behavior.observer.abs.ConcreteSubject;
import com.assuse.koala.pattern.behavior.observer.abs.Subject;
import com.assuse.koala.pattern.behavior.observer.service.Observer;
import com.assuse.koala.pattern.behavior.observer.service.impl.PlayerObserver;

public class PlayerController {
    public static void main(String[] args) {
        // 观察者创建
        Observer player1 = new PlayerObserver("A", "无警戒状态");
        Observer player2 = new PlayerObserver("B", "无警戒状态");

        // 目标类/主题类创建
        Subject subject = new ConcreteSubject();
        subject.attach(player1);
        subject.attach(player2);
        subject.change("警戒状态");
    }
}
