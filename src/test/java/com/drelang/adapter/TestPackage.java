package com.drelang.adapter;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试适配器模式
  * Created by Drelang on 2019/01/25
  */
public class TestPackage extends AppTest {

    @Test
    public void testAdapter() {
        Translator translator = new Translator("姚明");
        translator.attack();

        Forwards forwards = new Forwards("巴迪斯");
        forwards.attack();

        Guards guards = new Guards("麦克格雷迪");
        guards.defend();
    }
}
