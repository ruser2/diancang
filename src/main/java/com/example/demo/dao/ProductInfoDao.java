package com.example.demo.dao;

import com.example.demo.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-23 17:56
 * @Description:
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
