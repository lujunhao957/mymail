package com.lujunhao.mymail.coupon.dao;

import com.lujunhao.mymail.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-05 15:28:58
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
