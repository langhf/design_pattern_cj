package com.drelang.composite;

/**
  *  人力资源部, 树叶节点
  * Created by Drelang on 2019/01/25
  */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.println(this.getName() + " 员工招聘培训管理");
    }
}
