package com.drelang.facade;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageTest extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testPackage() {
        Facade facade = new Facade();
        LOGGER.info("Test Facade method A");
        facade.methodA();

        LOGGER.info("Test Facade method B");
        facade.methodB();
    }
}
