package com.drelang.bridge;

/*
  * 桥接模式: 将抽象部分与它的具体实现部分分离,使它们都可以独立地变化
  */

/**
  *  抽象类
  * Created by Drelang on 2019/01/26
  */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
