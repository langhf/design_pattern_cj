package com.drelang.templateMethod;

/**
  *  模板方法模式
  * Created by Drelang on 2019/01/20
  */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("Abstract class method");
    }
}
