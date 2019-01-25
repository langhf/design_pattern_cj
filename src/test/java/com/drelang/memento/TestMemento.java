package com.drelang.memento;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.relation.Role;

/**
  *  测试备忘录模式
  * Created by Drelang on 2019/01/25
  */
public class TestMemento extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestMemento.class);

    @Test
    public void testMemento() {
        LOGGER.info("大战 BOSS 前");
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        LOGGER.info("保存打 BOSS 前的状态");
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        RoleStateMemento roleStateMemento = lixiaoyao.saveState();
        roleStateCaretaker.setRoleStateMemento(roleStateMemento);

        LOGGER.info("大战 BOSS 后,损耗严重");
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        LOGGER.info("恢复之前的状态");
        lixiaoyao.recoveryState(roleStateCaretaker.getRoleStateMemento());
        lixiaoyao.stateDisplay();
    }
}
