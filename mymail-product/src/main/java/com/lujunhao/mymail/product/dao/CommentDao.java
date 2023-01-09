package com.lujunhao.mymail.product.dao;

import com.lujunhao.mymail.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:22:53
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
