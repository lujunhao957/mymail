package com.lujunhao.mymail.member.dao;

import com.lujunhao.mymail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:39:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
