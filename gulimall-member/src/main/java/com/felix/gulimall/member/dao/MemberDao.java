package com.felix.gulimall.member.dao;

import com.felix.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 22:33:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
