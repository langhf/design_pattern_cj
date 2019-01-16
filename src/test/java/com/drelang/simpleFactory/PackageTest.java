package com.drelang.simpleFactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PackageTest extends com.drelang.AppTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(PackageTest.class);
    @Test
    public void testAdd()
    {
        LOGGER.info("测试加法");
        Double testResult;
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(10.00);
        operation.setNumberB(15.00);
        testResult = operation.getResult();
//        assertEquals(testResult, 25.00);
        assertTrue(testResult == 25.00);
    }

    @Test
    public void testSub()
    {
        LOGGER.info("测试减法");
        Double testResult;
        Operation operation = OperationFactory.createOperation("-");
        operation.setNumberA(10.00);
        operation.setNumberB(15.00);
        testResult = operation.getResult();
//        assertEquals(testResult, -5.00);
        assertTrue(testResult == -5.00);
    }

    @Test
    public void testMul()
    {
        LOGGER.info("测试乘法");
        Double testResult;
        Operation operation = OperationFactory.createOperation("*");
        operation.setNumberA(10.00);
        operation.setNumberB(15.00);
        testResult = operation.getResult();
//        assertEquals(testResult, 150.0);
        assertTrue(testResult == 150.00);
    }

    @Test
    public void testDiv()
    {
        LOGGER.info("测试除法");
        Double testResult;
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA(15.00);
        operation.setNumberB(15.00);
        testResult = operation.getResult();
//        assertEquals(testResult, 1.0);
        assertTrue(testResult == 1.00);
    }

    @Test
    public void testDivNotZero()
    {
        LOGGER.info("测试被除数不能为零");
        Double testResult;
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA(15.00);
        operation.setNumberB(0.0);
//        expectedException.expect(ArithmeticException.class);
        testResult = operation.getResult();
        assertTrue(Double.isInfinite(testResult));
    }
}
