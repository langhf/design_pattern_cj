package com.drelang.chainOfResponsibility;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试职责链模式
  * Created by Drelang on 2019/01/26
  */
public class TestPackage extends AppTest {

    @Test
    public void testPackae() {
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request1 = new Request("请假", "小菜请假", 1);
        commonManager.requestApplication(request1);

        Request request2 = new Request("请假", "小菜请假", 4);
        commonManager.requestApplication(request2);

        Request request3 = new Request("加薪", "小菜请求加薪", 500);
        commonManager.requestApplication(request3);

        Request request4 = new Request("加薪", "小菜请求加薪", 1000);
        commonManager.requestApplication(request4);

    }
}
