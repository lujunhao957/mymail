package com.lujunhao.mymail.order.dao;

import com.lujunhao.mymail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:37:06
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
