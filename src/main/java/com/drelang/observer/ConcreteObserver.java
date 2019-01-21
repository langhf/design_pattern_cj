package com.drelang.observer;

public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        observerState = concreteSubject.getSubjectState();
        System.out.printf("观察者 %s 的新状态是 %s \n", name, observerState);
    }
}
