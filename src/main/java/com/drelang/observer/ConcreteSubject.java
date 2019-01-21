package com.drelang.observer;

import lombok.Getter;
import lombok.Setter;

/**
  *  具体主题或具体通知者，将有关状态存入具体观察者对象；
 *   在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
  * Created by Drelang on 2019/01/21
  */
@Getter
@Setter
public class ConcreteSubject extends Subject {
    private String subjectState;
}
