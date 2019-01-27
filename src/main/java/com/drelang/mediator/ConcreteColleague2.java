package com.drelang.mediator;

/**
  *  具体同事类2
  * Created by Drelang on 2019/01/26
  */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事 2 得到消息: " + message);
    }
}
