package com.drelang.mediator;

/**
  *  抽象中介者类, 若具体中介者只有一个则不需要该抽象类;
 *   中介者需要把信息发送给指定的同事
  * Created by Drelang on 2019/01/26
  */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
