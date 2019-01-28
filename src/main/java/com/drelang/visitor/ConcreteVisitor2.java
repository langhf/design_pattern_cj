package com.drelang.visitor;

/**
 *  具体访问者, 实现由 Visitor 声明的每个操作.
 *   每个操作实现算法的一部分, 而该算法片断是对应于结构中对象的类
 * Created by Drelang on 2019/01/28
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.printf("%s 被 %s 访问 \n", concreteElementA.getClass().getName(), this.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.printf("%s 被 %s 访问 \n", concreteElementB.getClass().getName(), this.getClass().getName());
    }
}
