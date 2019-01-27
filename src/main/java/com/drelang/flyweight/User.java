package com.drelang.flyweight;

/**
  *  用户类, 用于网站的客户账号, 是"网站"类的外部状态
  * Created by Drelang on 2019/01/27
  */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
