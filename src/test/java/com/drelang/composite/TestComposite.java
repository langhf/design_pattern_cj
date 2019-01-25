package com.drelang.composite;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  *  测试组合模式
  * Created by Drelang on 2019/01/25
  */
public class TestComposite extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestComposite.class);

    @Test
    public void testComposite() {
        LOGGER.info("创建北京总公司");
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        LOGGER.info("创建上海华东分公司");
        ConcreteCompany company1 = new ConcreteCompany("上海华东分公司");
        company1.add(new HRDepartment("华东分公司人力资源部"));
        company1.add(new FinanceDepartment("华东分公司财务部"));
        root.add(company1);

        LOGGER.info("创建华东分部南京办事处");
        ConcreteCompany company2 = new ConcreteCompany("南京办事处");
        company2.add(new HRDepartment("南京办事处人力资源部"));
        company2.add(new FinanceDepartment("南京办事处财务部"));
        company1.add(company2);

        LOGGER.info("创建华东分部杭州办事处");
        ConcreteCompany company3 = new ConcreteCompany("杭州办事处");
        company3.add(new HRDepartment("杭州办事处人力资源部"));
        company3.add(new FinanceDepartment("杭州办事处财务部"));
        company1.add(company3);

        LOGGER.info("总结构图:");
        root.display(2);

        LOGGER.info("各部门职责:");
        root.lineOfDuty();
    }
}
