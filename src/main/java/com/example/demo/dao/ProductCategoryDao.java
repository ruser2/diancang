package com.example.demo.dao;

import com.example.demo.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-22 18:49
 * @Description:
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
    public List<ProductCategory>  findByCategoryTypeIn(List<Integer> categoryTypeList);
    public int countByCategoryTypeIn(List<Integer>categoryTypeList);
}
