package com.example.demo.service;

import com.example.demo.entity.ProductCategory;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-23 16:39
 * @Description:
 */
public interface ProductCategoryService {
    ProductCategory findById(Integer productCategoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
