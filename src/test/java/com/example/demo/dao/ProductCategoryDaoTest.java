package com.example.demo.dao;

import com.example.demo.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-22 19:03
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryDaoTest {
    @Autowired
    ProductCategoryDao productCategoryDao;

    @Test
    public void testFindById() {
        log.error(productCategoryDao.findById(500).get().toString());
        ProductCategory query = new ProductCategory();
        query.setCategoryId(1);
        log.error(productCategoryDao.findOne(Example.of(query)).get().toString());
    }

    @Test
    public void testSave() {
        ProductCategory old=productCategoryDao.findById(2).get();
        old.setCategoryType(1);

        ProductCategory p=new ProductCategory();


        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("fddsfdsa");
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        Assert.assertNotEquals(null,productCategoryDao.save(productCategory));

    }
    @Test
    public void testFindByCategoryTypeIn(){
        List<Integer> typeIds = Arrays.asList(1, 2, 3, 4);
        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(typeIds);
        Assert.assertNotEquals(0,productCategoryDao.countByCategoryTypeIn(typeIds));
        Assert.assertNotEquals(0,result.size());
    }

}