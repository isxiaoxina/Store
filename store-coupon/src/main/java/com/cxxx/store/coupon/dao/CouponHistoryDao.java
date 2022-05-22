package com.cxxx.store.coupon.dao;

import com.cxxx.store.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 00:20:53
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
