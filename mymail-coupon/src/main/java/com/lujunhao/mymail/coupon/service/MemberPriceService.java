package com.lujunhao.mymail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujunhao.common.utils.PageUtils;
import com.lujunhao.mymail.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:41:18
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

