package com.drelang.adapter;

/**
  *  中锋
  * Created by Drelang on 2019/01/25
  */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 " + this.getName() + " 进攻");
    }

    @Override
    public void defend() {
        System.out.println("中锋 " + this.getName() + " 防守");
    }
}
