package com.drelang.interpreter;

/**
  *  音速类
  * Created by Drelang on 2019/01/28
  */
public class Speed extends Expression {
    @Override
    public void execute(String key, Double value) {
        String speed;
        if (value < 500) {
            speed = "快速";
        }
        else if (value >= 1000) {
            speed = "慢速";
        }
        else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }

}
