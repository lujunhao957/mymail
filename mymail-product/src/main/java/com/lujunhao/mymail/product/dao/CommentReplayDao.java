package com.lujunhao.mymail.product.dao;

import com.lujunhao.mymail.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-05 12:18:51
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
