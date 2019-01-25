package com.drelang.memento;

import lombok.Data;

/**
  *  角色状态存储类
  * Created by Drelang on 2019/01/25
  */
@Data
public class RoleStateMemento {
    private Integer vit;    // 生命力
    private Integer atk;    // 攻击力
    private Integer def;    // 防御力

    public RoleStateMemento(Integer vit, Integer atk, Integer def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
}
