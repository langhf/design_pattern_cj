package com.drelang.mediator;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试中介者模式
  * Created by Drelang on 2019/01/26
  */
public class TestMediator extends AppTest {

    @Test
    public void testMediator() {
        ConcreteMediator mediator = new ConcreteMediator();

        // 让两个具体同事类认识中介者对象
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        // 让中介者认识各个具体同事类对象
        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.send("吃过饭了吗");
        concreteColleague2.send("没有呢, 你打算请客?");
    }
}
