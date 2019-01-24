package com.drelang.state;

/**
  *  睡眠状态
  * Created by Drelang on 2019/01/24
  */
public class SleepState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间： %d 点不行了，睡着了。 \n", work.getHour());
    }
}
