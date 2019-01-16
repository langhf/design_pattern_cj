package com.drelang.strategy;

/**
  *  正常收费子类
  * Created by Drelang on 2019/01/14
  */
public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
