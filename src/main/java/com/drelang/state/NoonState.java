package com.drelang.state;

/**
  *  中午工作状态
  * Created by Drelang on 2019/01/24
  */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.printf("当前时间： %d 点 饿了，午饭：犯困，午休。 \n", work.getHour());
        }
        else {
            work.setCurrent(new AfterNoonState());
            work.writeProgram();
        }
    }
}
