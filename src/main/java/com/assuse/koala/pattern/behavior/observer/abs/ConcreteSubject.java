package com.assuse.koala.pattern.behavior.observer.abs;

/**
 * 被观察者主题类实现
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    @Override
    public void change(String newState) {
        state = newState;
        System.out.println("基地状态更新为:" + newState);
        notifyObservers(newState);
    }
}
