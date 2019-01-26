package com.drelang.singleton;

/**
  *  饿汉式单例模式
 *   在类加载时就完成了初始化, 所以类加载较慢, 但获取对象的速度快
  * Created by Drelang on 2019/01/26
  */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton(); // 静态私有成员, 已初始化

    private EagerSingleton() {};

    public static EagerSingleton getInstance() {
        return instance;
    }
}
