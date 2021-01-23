package com.lm.shop.coupon.dao;

import com.lm.shop.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 21:01:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
