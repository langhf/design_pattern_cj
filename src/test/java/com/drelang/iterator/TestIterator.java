package com.drelang.iterator;

import com.drelang.AppTest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
  *  测试迭代器模式
  * Created by Drelang on 2019/01/25
  */
public class TestIterator extends AppTest {

    @Test
    public void testIterator() {
        ConcreteAggregate a = new ConcreteAggregate();
        List<Object> items = new ArrayList<>();
        items.add(0, "大鸟");
        items.add(1, "小菜");
        items.add(2, "行李");
        items.add(3, "老外");
        items.add(4, "公交内部员工");
        items.add(5, "小偷");
        a.setItems(items);

        Iterator i = new ConcreteIterator(a);
        Object item = i.first();

        while(! i.isDone()) {
            System.out.println(i.currentItem() + " 请买票");
            i.next();
        }
    }
}
