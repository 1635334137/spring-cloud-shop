package com.shop.order.fegin;

import com.shop.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//指定需要调用的微服务名称
@FeignClient(name = "shop-service-product")
public interface ProductFeignClient {

    /**
     * 定义各参数绑定时，@PathVariable、@RequestParam、@RequestHeader等可以指定参数属
     * 性，在Feign中绑定参数必须通过value属性来指明具体的参数名，不然会抛出异常
     */
    //调用的请求路径：和服务提供方的对外接口一致
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    Product findById(@PathVariable("id") Long id);
}
