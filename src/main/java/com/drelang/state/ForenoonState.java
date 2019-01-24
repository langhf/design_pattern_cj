package com.drelang.state;

/**
  *  上午和中午工作状态类
  * Created by Drelang on 2019/01/24
  */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.printf("当前时间： %d 点 商务工作，精神百倍 \n", work.getHour());
        }
        else {
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
