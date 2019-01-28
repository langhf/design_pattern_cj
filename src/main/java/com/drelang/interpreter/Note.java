package com.drelang.interpreter;

/**
  *  音符类
  * Created by Drelang on 2019/01/28
  */
public class Note extends Expression {
    @Override
    public void execute(String key, Double value) {
        String note = "";
        switch (key) {
            case "C" :
                note = "1";
                break;
            case "D" :
                note = "2";
                break;
            case "E" :
                note = "3";
                break;
            case "F" :
                note = "4";
                break;
            case "G" :
                note = "5";
                break;
            case "A" :
                note = "6";
                break;
            case "B" :
                note = "7";
                break;
        }
        System.out.print(note + " ");
    }
}
