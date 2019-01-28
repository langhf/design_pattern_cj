package com.drelang.visitor;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试访问者模式
  * Created by Drelang on 2019/01/28
  */
public class TestVisitor extends AppTest {

    @Test
    public void testVisitor() {
        ObjectStructure objectStructure = new ObjectStructure();
        // 加入新 element
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        // 接受具体访问者访问
        objectStructure.accept(new ConcreteVisitor1());
        objectStructure.accept(new ConcreteVisitor2());
    }
}
