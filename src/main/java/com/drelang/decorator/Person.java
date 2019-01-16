package com.drelang.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  *  Component 类，被装饰的类
  * Created by Drelang on 2019/01/15
  */
public class Person {
    private static final Logger LOGGER = LoggerFactory.getLogger(Person.class);
    private String name;

    // 提供无参构造函数
    public Person() {};

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" +  name);
    }
}
