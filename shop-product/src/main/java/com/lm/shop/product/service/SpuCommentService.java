package com.lm.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 20:51:08
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

