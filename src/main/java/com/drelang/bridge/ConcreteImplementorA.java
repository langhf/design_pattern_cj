package com.drelang.bridge;

/**
  *  具体实现类A
  * Created by Drelang on 2019/01/26
  */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 A 的方法执行");
    }
}
