package com.drelang.command;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试命令模式
  * Created by Drelang on 2019/01/26
  */
public class TestCommand extends AppTest {


    @Test
    public void testCommand() {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand(new Receiver()));
        invoker.executeCommand();

    }
}
