package com.drelang.facade;

/**
  *  外观模式: 为子系统中的一组接口提供一个一致的界面，此模式定义了
 *                    一个高层接口，这个接口是的这一子系统更加容易使用。
  * Created by Drelang on 2019/01/20
  */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A( ) ------------------");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }

    public void methodB() {
        System.out.println("方法组B( ) ------------------");
        subSystemThree.methodThree();
    }
}
