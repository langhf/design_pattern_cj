package com.drelang.templateMethod;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageTest extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testPacage() {
        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
