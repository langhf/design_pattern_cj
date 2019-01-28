package com.drelang.visitor;

/**
  *  Element 类, 定义一个 accept 操作, 它以一个访问者为参数
 *   一般具体的 element 固定时才用访问者模式, 就是说后续开发中
 *   不会再增加具体的 element, 只会增加具体的 visitor
  * Created by Drelang on 2019/01/28
  */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
