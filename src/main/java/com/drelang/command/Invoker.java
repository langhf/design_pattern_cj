package com.drelang.command;

/**
  *  调用者, 要求该命令执行这个请求
  * Created by Drelang on 2019/01/26
  */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
