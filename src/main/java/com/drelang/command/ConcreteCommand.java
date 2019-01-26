package com.drelang.command;

/**
  *  具体命令类, 将一个接收者绑定于一个动作, 动用接收者相应的
 *   操作, 以实现 execute
  * Created by Drelang on 2019/01/26
  */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
