package com.drelang.composite;

/**
  *  财务部, 树叶节点
  * Created by Drelang on 2019/01/25
  */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(Integer depth) {
        for(int i=0; i<depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.getName() + " 公司财务收支管理");
    }
}
