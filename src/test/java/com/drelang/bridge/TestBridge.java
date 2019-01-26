package com.drelang.bridge;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  *  测试桥接模式
  * Created by Drelang on 2019/01/26
  */
public class TestBridge extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBridge.class);

    @Test
    public void testBridge() {
        Abstraction abstraction = new RefinedAbstraction();

        LOGGER.info("设置具体实现为: A");
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        LOGGER.info("设置具体实现为: B");
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
