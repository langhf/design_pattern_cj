package com.drelang.state;

/**
  *  下班休息状态
  * Created by Drelang on 2019/01/24
  */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间： %d 点下班回家了。 \n", work.getHour());
    }
}
