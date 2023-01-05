package com.lujunhao.mymail.order.dao;

import com.lujunhao.mymail.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-05 15:54:06
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
