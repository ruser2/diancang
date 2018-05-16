package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 13:58
 * @Description:
 */
@AllArgsConstructor
@Getter
public enum  ProductStatusEnum {

    UP(0,"上架"),
    DOWN(1,"下架");
    private int code;
    private String message;



}
