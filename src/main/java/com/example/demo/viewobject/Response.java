package com.example.demo.viewobject;

import lombok.Data;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 16:05
 * @Description:
 */
@Data
public class Response <T>{
    private Integer code;
    private String message;
    private T data;

}
