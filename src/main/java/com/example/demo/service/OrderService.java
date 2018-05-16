package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 21:09
 * @Description:
 */
public interface OrderService {
    //创建订单
    OrderDTO create(OrderDTO orderDTO);

    //查询一个订单
    OrderDTO findById(String orderId);

    //查询订单列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    //支付订单
    OrderDTO paid(OrderDTO orderDTO);

    //完结订单
    OrderDTO finish(OrderDTO orderDTO);

    //取消订单
    OrderDTO cancel(OrderDTO orderDTO);
}
