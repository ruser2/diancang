package com.example.demo.service;

import com.example.demo.dto.CartDTO;
import com.example.demo.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 14:05
 * @Description:
 */
public interface ProductInfoService {
    ProductInfo findById(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);
    //减库存
    void increaseStock(List<CartDTO> cartDTOList);
    //加库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
