package com.lm.shop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lm.shop.ware.dao")
@SpringBootApplication
public class ShopWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopWareApplication.class, args);
    }

}
