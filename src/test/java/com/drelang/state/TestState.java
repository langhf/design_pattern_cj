package com.drelang.state;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  *  测试状态模式
  * Created by Drelang on 2019/01/24
  */
public class TestState extends AppTest {

    private static final Logger LOGGER  = LoggerFactory.getLogger(TestState.class);

    @Test
    public void testState() {
        Work work = new Work();
        LOGGER.info("设置当前时间为 9 点");
        work.setHour(9);
        work.writeProgram();
        LOGGER.info("设置当前时间为 10 点");
        work.setHour(10);
        work.writeProgram();
        LOGGER.info("设置当前时间为 12 点");
        work.setHour(12);
        work.writeProgram();
        LOGGER.info("设置当前时间为 13 点");
        work.setHour(13);
        work.writeProgram();
        LOGGER.info("设置当前时间为 14 点");
        work.setHour(14);
        work.writeProgram();
        LOGGER.info("设置当前时间为 17 点");
        work.setHour(17);
        work.writeProgram();

        LOGGER.info("将工作设置为：结束");
        work.setIsFinished(true);
        work.writeProgram();

        LOGGER.info("设置当前时间为 19 点");
        work.setHour(19);
        work.writeProgram();
        LOGGER.info("设置当前时间为 22 点");
        work.setHour(22);
        work.writeProgram();
    }
}
