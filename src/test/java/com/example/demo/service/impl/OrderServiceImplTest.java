package com.example.demo.service.impl;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.OrderDetail;
import com.example.demo.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 22:14
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    OrderService orderService;
    @Test
    public void TestCreate() throws Exception {
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName("wo ");
        orderDTO.setBuyerAddress("wc");
        orderDTO.setBuyerPhone("18505911655");
        orderDTO.setBuyerOpenid("123456");
        List<OrderDetail> orderDetailList=new ArrayList<OrderDetail>();
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setProductId("1");
        orderDetail.setProductQuantity(3);
        orderDetailList.add(orderDetail);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderService.create(orderDTO);

    }

    @Test
    public void TestFindById() throws Exception {
    }

    @Test
    public void TestFindList() throws Exception {
    }

    @Test
    public void TestPaid() throws Exception {
    }

    @Test
    public void TestFinish() throws Exception {
    }

    @Test
    public void TestCancel() throws Exception {
    }

}