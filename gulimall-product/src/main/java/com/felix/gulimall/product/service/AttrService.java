package com.felix.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.felix.common.utils.PageUtils;
import com.felix.gulimall.product.entity.AttrEntity;
import com.felix.gulimall.product.vo.AttrGroupRelationVo;
import com.felix.gulimall.product.vo.AttrRespVo;
import com.felix.gulimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 15:55:11
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttrById(AttrVo attr);


    void deleteRelation(AttrGroupRelationVo[] vos);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    List<Long> selectSearchAttrs(List<Long> attrIds);
}

