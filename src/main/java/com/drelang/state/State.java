package com.drelang.state;

/**
  * 状态模式：当一个对象的内在状态改变时允许改变其他行为，
 *                      这个对象看起来像是改变了其类
  * Created by Drelang on 2019/01/25
  */
public abstract class State {
    public abstract void writeProgram(Work work);
}
