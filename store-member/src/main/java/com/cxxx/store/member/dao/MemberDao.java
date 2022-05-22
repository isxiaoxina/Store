package com.cxxx.store.member.dao;

import com.cxxx.store.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yjj
 * @email isxiaoxina@gmail.com
 * @date 2022-04-14 16:05:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
