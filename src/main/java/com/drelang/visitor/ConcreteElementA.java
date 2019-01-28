package com.drelang.visitor;

/**
  *  具体 element A
  * Created by Drelang on 2019/01/28
  */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
