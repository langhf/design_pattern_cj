package com.drelang.strategy;

/**
  *  返利收费子类
  * Created by Drelang on 2019/01/14
  */
public class CashReturn extends CashSuper {

    private Double moneyCondition = 0.0d;
    private Double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public Double acceptCash(Double money) {
        Double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
