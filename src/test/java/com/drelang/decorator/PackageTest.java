package com.drelang.decorator;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageTest extends AppTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testOne() {
        Person drelang = new Person("Drelang");
        LOGGER.info("第一种装扮");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        LOGGER.info("用破球鞋去装饰人物 drelang");
        sneakers.decorate(drelang);
        LOGGER.info("用垮裤去装饰穿了破球鞋的人物 drelang");
        bigTrouser.decorate(sneakers);
        LOGGER.info("用大T恤去装饰穿了破球鞋和垮裤的人物 drelang");
        tShirts.decorate(bigTrouser);
        LOGGER.info("从外到内展示人物，直到人名");
        tShirts.show();
    }
}
