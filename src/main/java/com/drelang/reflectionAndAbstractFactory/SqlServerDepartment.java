package com.drelang.reflectionAndAbstractFactory;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 SQL Server 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 SQL Server 中根据 ID 得到 Department 表一条记录");
        return null;
    }
}
