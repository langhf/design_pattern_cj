package com.drelang.builder;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
  *  要建造的产品类
  * Created by Drelang on 2019/01/20
  */
@Data
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品 创建 -----");
        for(String part : parts) {
            System.out.println(part);
        }
    }
}
