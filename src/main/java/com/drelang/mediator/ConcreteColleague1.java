package com.drelang.mediator;

/**
  *  具体同事类2
  * Created by Drelang on 2019/01/26
  */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    /**
     *  通过中介者来发送消息, 而不是自己直接发
     * @param message
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事 1 得到消息" + message);
    }
}
