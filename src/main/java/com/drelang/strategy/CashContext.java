package com.drelang.strategy;

/**
  *  CashContext 类，策略与简单工厂结合
  * Created by Drelang on 2019/01/14
  */
public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;

            case "满300返100":
                cashSuper = new CashReturn("300", "100");
                break;

            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;

             default:
                 cashSuper = null;
        }
    }

    public Double getResult(Double money) {
        return cashSuper.acceptCash(money);
    }
}
