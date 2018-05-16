package com.example.demo.service.impl;

import com.example.demo.entity.ProductInfo;
import com.example.demo.service.ProductInfoService;
import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BeanPath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.data.querydsl.QSort;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 14:25
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    ProductInfoService productInfoService;

    @Test
    public void TestFindById() throws Exception {
        Assert.assertEquals(null, productInfoService.findById(new String("1")));
    }

    @Test
    public void TestFindUpAll() throws Exception {
        List<ProductInfo> list = productInfoService.findUpAll();
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void TestFindAll() throws Exception {
        QPageRequest request = new QPageRequest(0, 20, new QSort(new OrderSpecifier<Comparable>(Order.DESC, new BeanPath(ProductInfo.class, "productName")), new OrderSpecifier<Comparable>(Order.ASC, new BeanPath(ProductInfo.class, "productId"))));
//        request.getSort().
        Page<ProductInfo> page = productInfoService.findAll(request);
        for (ProductInfo item : page.getContent()) {
            System.out.println(item);
        }
    }

    @Test
    public void TestSave() throws Exception {


        ProductInfo add = new ProductInfo();
        add.setProductId("44");
        add.setProductDescription("dfdssaeli");
        add.setCreateTime(new Date());
        add.setUpdateTime(new Date());
        add.setProductName("ssfsfsdfsd");
        add.setProductPrice(new BigDecimal(18.15));
        add.setProductStock(144);
        add.setProductIcon("xx1.jpg");
        add.setProductStatus(1);
        add.setCategoryType(3);
        Assert.assertNotEquals(null, productInfoService.save(add));
    }

}