package com.drelang.adapter;

import lombok.Data;

/**
  *  球员类，有姓名属性，进攻和防守方法
  * Created by Drelang on 2019/01/25
  */
@Data
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defend();
}
