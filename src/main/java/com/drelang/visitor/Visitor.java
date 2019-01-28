package com.drelang.visitor;

/**
  *  访问者类, 为该对象结构中 ConcreteElement 的每一个类声明一个 visit 操作
 *   一般来说该类定义好了之后不会再变, 因为具体的 element 数量是固定的
  * Created by Drelang on 2019/01/28
  */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
