package com.shop.service;

import com.shop.entity.Product;

import java.util.List;

/**
 * 商品服务
 */
public interface ProductService {
    //根据id查询
    Product findById(Long id);

    //查询全部
    List findAll();

    //保存
    void save(Product product);

    //更新
    void update(Product product);

    //删除
    void delete(Long id);

}
