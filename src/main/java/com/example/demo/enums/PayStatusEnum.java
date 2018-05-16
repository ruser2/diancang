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
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    PAYED(1,"支付成功");
    int code;
    String description;
}
