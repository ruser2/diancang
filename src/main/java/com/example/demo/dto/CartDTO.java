package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 22:02
 * @Description:
 */
@Data
@AllArgsConstructor
public class CartDTO {
    private String productId;
    private Integer productQuantity;

}
