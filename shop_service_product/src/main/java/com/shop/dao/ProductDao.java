package com.shop.dao;

import com.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 商品DAO
 * JpaSpecificationExecutor 提供复杂查询，需要传递一个Specification接口，Specification接口提供toPredicate方法用于复杂查询
 * @author Mr.Lan
 * @create: 2022-01-21 14:29
 */
@Repository
public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
