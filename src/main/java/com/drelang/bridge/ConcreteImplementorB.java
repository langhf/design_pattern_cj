package com.drelang.bridge;

/**
  *  具体实现 B
  * Created by Drelang on 2019/01/26
  */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 B 的方法执行");
    }
}
