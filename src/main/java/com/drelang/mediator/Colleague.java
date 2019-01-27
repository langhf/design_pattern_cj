package com.drelang.mediator;

/**
  *  抽象同事类, 同事类需要知道中介者, 但是不需要知道其他同事
  * Created by Drelang on 2019/01/26
  */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
