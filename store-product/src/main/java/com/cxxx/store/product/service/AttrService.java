package com.cxxx.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-13 21:34:05
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

