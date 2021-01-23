package com.lm.shop.order.dao;

import com.lm.shop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 19:19:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
