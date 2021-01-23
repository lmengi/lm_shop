package com.lm.shop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 22:03:10
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

