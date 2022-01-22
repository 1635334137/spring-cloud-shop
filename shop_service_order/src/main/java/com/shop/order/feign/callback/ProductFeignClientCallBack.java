package com.shop.order.feign.callback;

import com.shop.entity.Product;
import com.shop.order.feign.ProductFeignClient;
import org.springframework.stereotype.Component;

/**
 * 商品熔断方法
 *
 * @author Mr.Lan
 * @create: 2022-01-22 15:04
 */
@Component
public class ProductFeignClientCallBack implements ProductFeignClient {

    /**
     * 降级方法
     */
    @Override
    public Product findById(Long id) {
        Product product = new Product();
        product.setId(-1l);
        product.setProductName("熔断：触发降级方法");
        return product;
    }
}
