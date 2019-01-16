package com.drelang.factoryMethod;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  *  测试工厂方法模式
 *  在客户端更改志愿者类型的时候，只需要更改产生志愿者的工厂即可。如将 UndergraduateFactory 更改为 VolunteerFactory 即可。
 *  工厂方法克服了简单工厂违背“开放-封闭”原则的缺点，又保持了封装对象创建过程的优点！
 *  工厂方法降低了客户程序与产品对象的耦合。
  * Created by Drelang on 2019/01/16
  */
public class PackageTest extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testUndergraduate() {
        LOGGER.info("测试大学生雷锋");
        LeiFeng leiFeng = new UndergraduateFactory().createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }

    @Test
    public void testVolunteer() {
        LOGGER.info("测试社区志愿者雷锋");
        LeiFeng leiFeng = new VolunteerFactory().createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }
}
