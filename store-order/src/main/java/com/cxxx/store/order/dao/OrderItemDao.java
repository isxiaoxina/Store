package com.cxxx.store.order.dao;

import com.cxxx.store.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 16:35:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
