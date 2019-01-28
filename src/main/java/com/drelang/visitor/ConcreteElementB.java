package com.drelang.visitor;

/**
  *  具体 element B
  * Created by Drelang on 2019/01/28
  */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
