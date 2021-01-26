package com.lm.shop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lm.shop.coupon.dao")
public class ShopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCouponApplication.class, args);
    }

}
