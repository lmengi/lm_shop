package com.lm.shop.member.feign;

import com.lm.shop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("shop-coupon")
public interface CouponFeignClient {

    @RequestMapping("/coupon/coupon/getCoupon")
    public R getCoupon();
}
