package com.drelang.memento;

import lombok.Data;

/**
  *  游戏角色类,用来存储角色的生命力,攻击力,防御力的数据
  * Created by Drelang on 2019/01/25
  */
@Data
public class GameRole {
    private Integer vit;   // 生命力
    private Integer atk;    // 攻击力
    private Integer def;    // 防御力

    /**
     * 状态显示
     */
    public void stateDisplay() {
        System.out.println("角色当前状态:");
        System.out.println("体力: " + vit);
        System.out.println("攻击力: " + atk);
        System.out.println("防御力: " + def);
    }

    /**
     * 获得初始状态
     */
    public void getInitState() {
        vit = 100;
        atk = 100;
        def = 100;
    }

    /**
     * 战斗后,属性值变为零
     */
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }

    /**
     * 保存角色状态
     * @return RoleStateMemento
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复角色状态
     * @param roleStateMemento 之前保存的角色状态
     */
    public void recoveryState(RoleStateMemento roleStateMemento) {
        vit = roleStateMemento.getVit();
        atk = roleStateMemento.getAtk();
        def = roleStateMemento.getDef();
    }
}
