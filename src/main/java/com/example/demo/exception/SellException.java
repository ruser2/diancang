package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 21:31
 * @Description:
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
