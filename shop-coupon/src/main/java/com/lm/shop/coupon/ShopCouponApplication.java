package com.lm.shop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lm.shop.coupon.dao")
@SpringBootApplication
public class ShopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCouponApplication.class, args);
    }

}
