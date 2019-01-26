package com.drelang.chainOfResponsibility;

/**
  *  管理者
  * Created by Drelang on 2019/01/26
  */
public abstract class Manager {
    protected String name;      // 管理者姓名
    protected Manager superior;     // 管理者的上一级

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplication(Request request);
}
