package com.drelang.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
  *  申请类
  * Created by Drelang on 2019/01/26
  */
@Data
@AllArgsConstructor
public class Request {
    private String requestType;     // 申请类别
    private String requestContent;      // 申请内容
    private Integer number;     // 数量

}
