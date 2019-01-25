package com.drelang.adapter;

/**
  *  前锋
  * Created by Drelang on 2019/01/25
  */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 " + this.getName() + " 进攻");
    }

    @Override
    public void defend() {
        System.out.println("前锋 " + this.getName() + " 防守");
    }
}
