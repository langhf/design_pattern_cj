package com.drelang.iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
  *  具体聚集类, 继承 Aggregate, 给 Iterator 提供对象类型
  * Created by Drelang on 2019/01/25
  */
@Data
public class ConcreteAggregate extends Aggregate {
    private List<Object> items;

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Integer count() {
        return items.size();
    }

}
