package com.drelang.singleton;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
  *  测试懒汉式和饿汉式单例模式
  * Created by Drelang on 2019/01/26
  */
public class TestSingleton extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestSingleton.class);

    @Test
    public void testSingleton() {
        LOGGER.info("测试懒汉式单例模式");
        Long startTime = System.currentTimeMillis();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        assertEquals("两个对象相等", lazySingleton, lazySingleton1);
        Long endTime = System.currentTimeMillis();
        System.out.println("所用时间: " + (endTime - startTime) + "ns");

        LOGGER.info("测试饿汉式单例模式");
        startTime = System.currentTimeMillis();
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        assertEquals("两个对象相等", eagerSingleton, eagerSingleton1);
        endTime = System.currentTimeMillis();
        System.out.println("所用时间: " + (endTime - startTime) + "ns");
    }
}
