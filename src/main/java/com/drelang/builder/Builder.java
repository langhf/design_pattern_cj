package com.drelang.builder;
/**
  *  Builder 类，为创建一个 Product 对象的各个部件指定的抽象接口
  * Created by Drelang on 2019/01/20
  */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
