package com.cxxx.store.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.store.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 16:05:02
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

