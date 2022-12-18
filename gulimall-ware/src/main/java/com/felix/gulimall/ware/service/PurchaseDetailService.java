package com.felix.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.felix.common.utils.PageUtils;
import com.felix.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author felix1203
 * @email 791422545@qq.com
 * @date 2022-12-10 23:02:20
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);
}

