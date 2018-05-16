package com.example.demo.service.impl;

import com.example.demo.entity.ProductCategory;
import com.example.demo.service.ProductCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: zhouyh
 * @Date: 2018-03-23 16:45
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    @Autowired
    ProductCategoryService productCategoryService;
    @Test
    public void TestFindById() throws Exception {
        Assert.assertNotEquals(null,productCategoryService.findById(1));
    }

    @Test
    public void TestFindAll() throws Exception {
        Assert.assertNotEquals(0,productCategoryService.findAll().size());
    }

    @Test
    public void TestFindByCategoryTypeIn() throws Exception {
        Assert.assertNotEquals(0,productCategoryService.findByCategoryTypeIn(Arrays.asList(3,10001)).size());
    }

    @Test
    public void TestSave() throws Exception {
        ProductCategory add=new ProductCategory();
        add.setCategoryType(1);
        add.setCreateTime(new Date());
        add.setUpdateTime(new Date());
        add.setCategoryName("fuck");
        Assert.assertNotEquals(null,productCategoryService.save(add));
    }

}