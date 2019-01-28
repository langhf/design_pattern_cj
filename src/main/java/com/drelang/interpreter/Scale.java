package com.drelang.interpreter;

/**
  *  音阶类
  * Created by Drelang on 2019/01/28
  */
public class Scale extends Expression{
    @Override
    public void execute(String key, Double value) {
        String scale = "";
        switch (value.intValue()) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.print(scale + " ");
    }
}
