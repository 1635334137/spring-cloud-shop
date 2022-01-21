package com.shop.order.controller;

import com.shop.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单Controller
 *
 * @author Mr.Lan
 * @create: 2022-01-21 14:42
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String order(Integer num){
        Product obj = restTemplate.getForObject("http://localhost:9003/product/2",Product.class);
        System.out.println(obj);
        return "操作成功！";
    }

    @GetMapping("/buy")
    public Product order(){
        Product product = restTemplate.getForObject("http://shop-service-product/product/2",Product.class);
        return product;
    }
}
