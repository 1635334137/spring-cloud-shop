package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 * Feign是Netflix开发的声明式，模板化的HTTP客户端 Feign可帮助我们更加便捷，优雅的调用HTTP API
 * 注意：Feign内部集成了Ribbon 所以不用再实例化一个基于Ribbon的RestTemplate，否则会报错找不到微服务
 */
@SpringBootApplication
@EnableFeignClients //添加Feign支持
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }

//    @LoadBalanced //基于Ribbon的服务调用与负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
