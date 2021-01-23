package com.lm.shop.coupon;

import com.lm.shop.coupon.entity.CouponEntity;
import com.lm.shop.coupon.service.CouponService;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ShopCouponApplicationTests {

    @Autowired
    private CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity e = new CouponEntity();
        e.setAmount(BigDecimal.valueOf(0.2));
        e.setCouponName("中秋节优惠券");
        couponService.save(e);
    }

}
