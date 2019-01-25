package com.drelang.composite;

import lombok.Data;

/**
  *  抽象公司类
  * Created by Drelang on 2019/01/25
  */
@Data
public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);    //增加
    public abstract void remove(Company c);     // 移除
    public abstract void display(Integer depth);    // 显示
    public abstract void lineOfDuty();  // 履行职责
}
