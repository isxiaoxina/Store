package com.cxxx.store.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 16:05:02
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

