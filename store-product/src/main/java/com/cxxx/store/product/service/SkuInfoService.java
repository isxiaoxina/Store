package com.cxxx.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-13 21:34:05
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

