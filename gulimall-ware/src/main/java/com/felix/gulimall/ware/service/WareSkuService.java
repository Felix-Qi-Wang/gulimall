package com.felix.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.felix.common.utils.PageUtils;
import com.felix.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 23:02:20
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);
}

