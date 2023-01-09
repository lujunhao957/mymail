package com.lujunhao.mymail.product.dao;

import com.lujunhao.mymail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:22:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
