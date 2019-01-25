package com.drelang.adapter;

/**
  *  后卫
  * Created by Drelang on 2019/01/25
  */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫 " + this.getName() + " 进攻");
    }

    @Override
    public void defend() {
        System.out.println("后卫 " + this.getName() + " 防守");
    }
}
