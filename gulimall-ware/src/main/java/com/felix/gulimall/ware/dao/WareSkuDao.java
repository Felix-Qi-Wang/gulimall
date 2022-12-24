package com.felix.gulimall.ware.dao;

import com.felix.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 23:02:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(@Param("skuId") Long skuId, @Param("wareId") Long wareId, @Param("skuNum") Integer skuNum);

    Long getSkuStock(Long item);
}
