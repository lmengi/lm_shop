package com.lm.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 20:51:09
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

