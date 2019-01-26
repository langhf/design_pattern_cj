package com.drelang.chainOfResponsibility;

/**
  *  总监
  * Created by Drelang on 2019/01/26
  */
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(name + ":" + request.getRequestType() + "数量 " + request.getNumber() + "被批准" );
        }
        else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
