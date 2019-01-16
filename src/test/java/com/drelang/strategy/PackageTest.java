package com.drelang.strategy;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

public class PackageTest extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);

    @Test
    public void testCashNormal() {
        LOGGER.info("测试正常收费");
        CashContext cashContext = new CashContext("正常收费");
        Double testResult = cashContext.getResult(100d);
        assertEquals(testResult, 100d);
    }

    @Test
    public void testCashRebate() {
        LOGGER.info("测试打8折");
        CashContext cashContext = new CashContext("打8折");
        Double testResult = cashContext.getResult(100d);
        assertEquals(testResult, 80d);
    }

    @Test
    public void testCashReturn() {
        LOGGER.info("测试满300减100");
        CashContext cashContext = new CashContext("满300返100");
        Double testResult = cashContext.getResult(340d);
        assertEquals(testResult, 240d);
    }
}
