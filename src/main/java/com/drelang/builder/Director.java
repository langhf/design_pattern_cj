package com.drelang.builder;

/**
  *  Director 是构建一个使用 Builder 接口的对象
 *   Director 指挥 Builder 按照何种顺序去构造一个 Product
 *   最终的产出应该是一个 Product
  * Created by Drelang on 2019/01/20
  */
public class Director {
    // 用来指挥建造过程
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
