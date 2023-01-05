package com.lujunhao.mymail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujunhao.common.utils.PageUtils;
import com.lujunhao.mymail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-05 15:54:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

