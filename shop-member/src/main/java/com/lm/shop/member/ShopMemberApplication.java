package com.lm.shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.lm.shop.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.lm.shop.member.feign")
public class ShopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopMemberApplication.class, args);
    }

}
