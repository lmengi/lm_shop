package com.lm.shop.product.dao;

import com.lm.shop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 20:51:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
