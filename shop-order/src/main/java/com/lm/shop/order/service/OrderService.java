package com.lm.shop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 19:19:56
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

