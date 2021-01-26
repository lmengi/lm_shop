package com.lm.shop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.lm.shop.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ShopWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopWareApplication.class, args);
    }

}
