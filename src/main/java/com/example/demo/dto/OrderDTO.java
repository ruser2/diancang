package com.example.demo.dto;

import com.example.demo.entity.OrderDetail;
import com.example.demo.entity.OrderMaster;
import lombok.Data;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 21:14
 * @Description:
 */
@Data
public class OrderDTO extends OrderMaster {
    private List<OrderDetail> orderDetailList;
}
