package com.cxxx.store.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 00:20:53
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

