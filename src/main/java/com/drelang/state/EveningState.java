package com.drelang.state;

/**
  *  晚间工作状态
  * Created by Drelang on 2019/01/24
  */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getIsFinished()) {
            work.setCurrent(new RestState());
            work.writeProgram();
        }
        else {
            if (work.getHour() < 21 ) {
                System.out.printf("当前时间： %d 点 加班哦，疲累至极 \n", work.getHour());
            }
            else {
                work.setCurrent(new SleepState());
                work.writeProgram();
            }
        }
    }
}
