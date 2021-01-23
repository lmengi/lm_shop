package com.lm.shop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.shop.common.utils.PageUtils;
import com.lm.shop.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 21:55:12
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

