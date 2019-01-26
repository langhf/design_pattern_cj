package com.drelang.singleton;

/**
  *  懒汉式 单例模式, 需要双重锁定, 考虑线程安全性
 *   比较懒, 在类加载时, 不创建实例, 因此类加载速度快, 但运行时获得对象的速度慢
  * Created by Drelang on 2019/01/26
  */
public class LazySingleton {
    private static LazySingleton lazySingleton;


    /**
     * 构造方法让其 private, 这就堵死了外界利用 new 创建此类实例的可能
     */
    private LazySingleton() {};

    /**
     * 静态, 同步, 公共访问点
     * @return LazySingleton
     */
    public static synchronized LazySingleton getInstance() {
        if ( lazySingleton == null ) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
