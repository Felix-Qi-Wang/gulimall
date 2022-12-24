package com.felix.gulimall.product.fallback;

import com.felix.common.exception.BizCodeEnume;
import com.felix.common.utils.R;
import com.felix.gulimall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;


@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnume.TO_MANY_REQUEST.getCode(),BizCodeEnume.TO_MANY_REQUEST.getMsg());
    }
}
