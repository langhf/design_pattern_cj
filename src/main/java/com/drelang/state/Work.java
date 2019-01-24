package com.drelang.state;

import lombok.Data;

/**
  *  当一个对象的行为取决于它的状态，并且它必须在运行时刻根据
 *   状态改变它的行为时，就可以考虑使用状态模式了
  * Created by Drelang on 2019/01/24
  */
@Data
public class Work {
    private State current;
    private Integer hour;
    private Boolean isFinished = false;

    public Work() {
        current = new ForenoonState();
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
