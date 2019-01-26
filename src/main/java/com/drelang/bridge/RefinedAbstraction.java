package com.drelang.bridge;

/**
  *  被提炼的对象
  * Created by Drelang on 2019/01/26
  */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
