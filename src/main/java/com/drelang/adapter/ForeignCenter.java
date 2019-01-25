package com.drelang.adapter;

import lombok.Data;

/**
  *  外籍中场，adaptee
  * Created by Drelang on 2019/01/25
  */
@Data
public class ForeignCenter {
    private String name;

    public void 进攻() {
        System.out.println("外籍中锋 " + name + " 进攻");
    }

    public void 防守() {
        System.out.println("外籍中锋 " + name + " 防守");
    }
}
