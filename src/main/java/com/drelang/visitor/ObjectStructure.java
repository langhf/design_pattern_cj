package com.drelang.visitor;

import java.util.ArrayList;
import java.util.List;

/**
  *  ObjectStructure 类, 能枚举它的元素, 可以提供一个高层的接口
 *   以允许访问者访问它的元素
  * Created by Drelang on 2019/01/28
  */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
