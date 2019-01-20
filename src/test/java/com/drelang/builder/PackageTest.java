package com.drelang.builder;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageTest extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testBuilder() {
        Director director = new Director();

        LOGGER.info("Test builder1");
        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        LOGGER.info("Test builder2");
        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
