package com.example.demo.controller;

import com.example.demo.entity.ProductCategory;
import com.example.demo.entity.ProductInfo;
import com.example.demo.service.ProductCategoryService;
import com.example.demo.service.ProductInfoService;
import com.example.demo.util.ResponseUtil;
import com.example.demo.viewobject.ProductInfoVO;
import com.example.demo.viewobject.ProductVO;
import com.example.demo.viewobject.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhouyh
 * @Date: 2018-03-25 16:03
 * @Description:
 */
@RestController
@RequestMapping("/buyer/product/")
public class BuyerProductController {

    @Autowired
    ProductInfoService productInfoService;
    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public Response<ProductVO> list() {
        //1.查询所有上架商品
        List<ProductInfo> upProductInfos = productInfoService.findUpAll();
        //2.查询类目(一次性查询)
        //lambda
        List<Integer> categoryTypeList = upProductInfos.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategories = productCategoryService.findByCategoryTypeIn(categoryTypeList);
        //3.拼装数据
        List<ProductVO> result = new ArrayList<ProductVO>();
        for (ProductCategory item : productCategories) {
            ProductVO resultItem = new ProductVO();
            resultItem.setCategoryType(item.getCategoryType());
            resultItem.setCategoryName(item.getCategoryName());
            List<ProductInfoVO> innerResult = new ArrayList<ProductInfoVO>();
            for (ProductInfo productInfo : upProductInfos) {
                if (productInfo.getCategoryType().equals(item.getCategoryType())) {
                    ProductInfoVO innerItem = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, innerItem);
                    innerResult.add(innerItem);
                }
            }
            resultItem.setProductInfoVOList(innerResult);
            result.add(resultItem);
        }
        return ResponseUtil.success(result);
    }
}
