package com.drelang.reflectionAndAbstractFactory;

public class AccessUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在 Access 中给 User 表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 Access 中根据 ID 得到 User 表一条记录");
        return null;
    }
}
