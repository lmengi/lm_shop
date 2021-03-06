package com.lm.shop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 19:19:56
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

