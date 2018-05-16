package com.example.demo.dao;

import com.example.demo.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: zhouyh
 * @Date: 2018-03-23 17:59
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    ProductInfoDao productInfoDao;

    @Test
    public void TestFindByProductStatus() throws Exception {
        Assert.assertNotEquals(0, productInfoDao.findByProductStatus(0).size());
    }

    @Test
    public void TestSave() {
        ProductInfo add = new ProductInfo();
        add.setProductId("2");
        add.setProductDescription("deli");
        add.setCreateTime(new Date());
        add.setUpdateTime(new Date());
        add.setProductName("shit");
        add.setProductPrice(new BigDecimal(8.5));
        add.setProductStock(1000);
        add.setProductIcon("xx.jpg");
        add.setProductStatus(0);
        add.setCategoryType(3);
        Assert.assertNotEquals(null, productInfoDao.save(add));
    }


}