package com.drelang.iterator;

/**
  *  抽象迭代类, 用于定义得到开始对象,得到下一个对象,判断是否到
 *   结尾,当前对象等抽象方法, 统一接口
  * Created by Drelang on 2019/01/25
  */
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract Boolean isDone();
    public abstract Object currentItem();
}
