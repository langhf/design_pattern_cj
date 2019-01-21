package com.drelang.reflectionAndAbstractFactory;

/**
  *  用户表接口
  * Created by Drelang on 2019/01/21
  */
public interface IUser {
    void insert(User user);
    User getUser(int id);
}
