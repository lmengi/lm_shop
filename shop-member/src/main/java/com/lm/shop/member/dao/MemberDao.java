package com.lm.shop.member.dao;

import com.lm.shop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lsk
 * @email jlwswk@126.com
 * @date 2021-01-23 21:55:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
