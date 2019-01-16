package com.drelang.decorator;

/**
  *  服饰类是一个装饰类
  * Created by Drelang on 2019/01/15
  */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
