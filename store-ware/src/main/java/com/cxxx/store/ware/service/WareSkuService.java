package com.cxxx.store.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 17:28:31
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

