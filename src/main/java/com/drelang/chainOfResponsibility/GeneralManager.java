package com.drelang.chainOfResponsibility;

/**
  *  总经理
  * Created by Drelang on 2019/01/26
  */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType().equals("请假")) {
            System.out.println(name + ":" + request.getRequestType() + "数量 " + request.getNumber() + "被批准" );
        }
        else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(name + ":" + request.getRequestType() + "数量 " + request.getNumber() + "被批准" );
        }
        else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(name + ":" + request.getRequestType() + "数量 " + request.getNumber() + "再说吧" );
        }
    }
}
