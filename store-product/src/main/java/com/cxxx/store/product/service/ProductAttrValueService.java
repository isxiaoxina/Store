package com.cxxx.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-13 21:34:05
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

