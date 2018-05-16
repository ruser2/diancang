package com.example.demo.dao;

import com.example.demo.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 19:54
 * @Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {
    @Autowired
    OrderMasterDao orderMasterDao;

    @Test
    public void TestFindByBuyerOpenid() throws Exception {
//        Sort sort = new Sort(Sort.Direction.ASC, "buyerOpenid", "buyerName");
        List<Sort.Order> orders=new ArrayList<Sort.Order>();
        orders.add(new Sort.Order(Sort.Direction.ASC,"buyerOpenid"));
        orders.add(new Sort.Order(Sort.Direction.DESC,"buyerName"));
        Sort sort = Sort.by(orders);

        PageRequest request = PageRequest.of(1, 50, sort);
        System.out.println(request);
        Page<OrderMaster> result = orderMasterDao.findByBuyerOpenid("openid1", request);
        if (result.getTotalPages() > 0) {
            for (OrderMaster item : result.getContent()
                    ) {
                System.out.println(item);
            }
        }
    }

    @Test
    public void TestSave() {
        OrderMaster add = new OrderMaster();
        add.setBuyerName("fucker");
        add.setBuyerPhone("18505911655");
        add.setOrderId("5");
        add.setBuyerOpenid("openid1");
        add.setBuyerAddress("wc");
        add.setCreateTime(new Date());
        add.setUpdateTime(new Date());
        add.setOrderAmount(new BigDecimal(31.4));
        Assert.assertNotEquals(null, orderMasterDao.save(add));
    }

}