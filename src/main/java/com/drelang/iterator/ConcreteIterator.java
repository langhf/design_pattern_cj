package com.drelang.iterator;

import java.util.List;

/**
  *  具体迭代器类, 继承 Iterator
  * Created by Drelang on 2019/01/25
  */
public class ConcreteIterator extends Iterator {
    private Integer current = 0;
    private ConcreteAggregate concreteAggregate;

    // 初始化时将聚集对象传入
    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        List<Object> items = concreteAggregate.getItems();
        return items.get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < concreteAggregate.count()) {
            ret = concreteAggregate.getItems().get(current);
        }
        return ret;
    }

    @Override
    public Boolean isDone() {
//        System.out.println(current + " " + concreteAggregate.count());
        return current >= concreteAggregate.count();
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getItems().get(current);
    }
}
