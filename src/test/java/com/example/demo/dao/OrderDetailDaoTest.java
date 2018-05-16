package com.example.demo.dao;

import com.example.demo.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 21:02
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailDaoTest {
    @Autowired
    OrderDetailDao orderDetailDao;
    @Test
    public void TestFindByOrderId() throws Exception {
        List<OrderDetail> orderDetails = orderDetailDao.findByOrderId("1");
        Assert.assertNotEquals(0,orderDetails);
    }


    @Test
    public void TestSave() throws Exception {
        OrderDetail add=new OrderDetail();
        add.setCreateTime(new Date());
        add.setUpdateTime(new Date());
        add.setDetailId("3");
        add.setOrderId("1");
        add.setProductId("2");
        add.setProductName("ffff");
        add.setProductPrice(new BigDecimal(12.8));
        add.setProductQuantity(2);

        Assert.assertNotNull(orderDetailDao.save(add));
    }

}