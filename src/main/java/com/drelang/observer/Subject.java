package com.drelang.observer;

import java.util.ArrayList;
import java.util.List;

/**
  *  主题或抽象通知者
  * Created by Drelang on 2019/01/21
  */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 为了不与系统的 notify 函数冲突，加上下划线
    public void _notify() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
