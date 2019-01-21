package com.drelang.reflectionAndAbstractFactory;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 Access 中根据 ID 得到 Departmen 表一条记录");
        return null;
    }
}
