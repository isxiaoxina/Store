package com.cxxx.store.product.dao;

import com.cxxx.store.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-13 21:34:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
