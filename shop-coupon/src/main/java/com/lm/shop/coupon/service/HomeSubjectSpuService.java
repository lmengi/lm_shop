package com.lm.shop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 21:01:02
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

