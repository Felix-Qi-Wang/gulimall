package com.felix.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.felix.common.utils.PageUtils;
import com.felix.gulimall.product.entity.AttrGroupEntity;
import com.felix.gulimall.product.vo.AttrGroupRelationVo;

import java.util.Map;

/**
 * 属性分组
 *
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 15:55:11
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);


}

