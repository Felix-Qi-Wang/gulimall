package com.felix.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.felix.common.utils.PageUtils;
import com.felix.gulimall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 15:55:11
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveProductAttr(List<ProductAttrValueEntity> collect);

    List<ProductAttrValueEntity> baseAttrListforspu(Long spuId);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);
}

