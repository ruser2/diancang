package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 18:23
 * @Description:
 */
@AllArgsConstructor
@Getter
public enum  OrderStatusEnum {
    NEW(0,""),
    FINISHED(1,""),
    END(2,"");
    int code;
    String description;
}
