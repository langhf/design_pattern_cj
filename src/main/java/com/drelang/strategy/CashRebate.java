package com.drelang.strategy;

/**
  *  打折收费子类
  * Created by Drelang on 2019/01/14
  */
public class CashRebate extends CashSuper {

    private Double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public Double acceptCash(Double money) {
        return money * moneyRebate;
    }
}
