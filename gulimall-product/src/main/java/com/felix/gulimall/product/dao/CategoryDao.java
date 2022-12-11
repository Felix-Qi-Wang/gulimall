package com.felix.gulimall.product.dao;

import com.felix.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 15:55:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
