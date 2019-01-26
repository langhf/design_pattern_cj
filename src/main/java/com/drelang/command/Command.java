package com.drelang.command;

/**
  *  命令类, 用来声明执行操作的接口
  * Created by Drelang on 2019/01/26
  */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
