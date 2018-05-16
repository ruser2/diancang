package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 21:31
 * @Description:
 */
@AllArgsConstructor
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(9,"库存不足");
    private Integer code;
    private String message;


}
