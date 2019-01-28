package com.drelang.interpreter;

/**
  *  表达式工厂类
  * Created by Drelang on 2019/01/28
  */
public class ExpressionFactory {
    public static Expression getExpression(String key) {
        Expression expression = null;
        switch (key) {
            case "O":
                expression = new Scale();
                break;
            case  "T":
                expression = new Speed();
                break;
            case  "C":
            case  "D":
            case  "E":
            case  "F":
            case  "G":
            case  "A":
            case  "B":
            case  "P":
                expression = new Note();
                break;
        }
        return expression;
    }
}
