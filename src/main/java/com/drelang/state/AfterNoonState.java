package com.drelang.state;
/**
  *  下午和傍晚工作状态类
  * Created by Drelang on 2019/01/24
  */
public class AfterNoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.printf("当前时间： %d 点 下午状态还不错，继续努力 \n", work.getHour());
        }
        else {
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }
}
