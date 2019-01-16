package com.drelang.proxy;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  *  有无代理，都可以完成送礼物动作
  * Created by Drelang on 2019/01/15
  */
public class PackageTest extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testProxy() {
        LOGGER.info("有代理测试");
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();
    }

    @Test
    public void testNoProxy() {
        LOGGER.info("无代理测试");
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Pursuit zhuo = new Pursuit(jiaojiao);
        zhuo.GiveDolls();
        zhuo.GiveFlowers();
        zhuo.GiveChocolate();
    }
}
