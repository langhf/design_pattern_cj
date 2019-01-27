package com.drelang.mediator;

import lombok.Data;

/**
  *  具体中介者类
  * Created by Drelang on 2019/01/26
  */
@Data
public class ConcreteMediator extends Mediator {

    // 需要了解所有的具体同事对象, 这是中介者模式的缺点
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague1) {
            concreteColleague2.notify(message);
        }
        else {
            concreteColleague1.notify(message);
        }
    }
}
