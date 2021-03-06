package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer //激活EurekaServer端配置
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
