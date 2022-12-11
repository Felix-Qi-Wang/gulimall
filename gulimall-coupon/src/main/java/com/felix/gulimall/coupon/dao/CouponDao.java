package com.felix.gulimall.coupon.dao;

import com.felix.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 22:19:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
