package com.shop.order.controller;

import com.shop.entity.Product;
import com.shop.order.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单Controller
 *
 * @author Mr.Lan
 * @create: 2022-01-21 14:42
 */
@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductFeignClient productFeignClient;

//    @GetMapping("/{id}")
//    public String order(Integer num){
//        Product obj = restTemplate.getForObject("http://localhost:9003/product/2",Product.class);
//        System.out.println(obj);
//        return "操作成功！";
//    }

    @GetMapping("/buy/{id}")
    public Product order(@PathVariable Long id){
        return productFeignClient.findById(id);
    }
}
