package com.cxxx.store.order.dao;

import com.cxxx.store.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 16:35:33
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
