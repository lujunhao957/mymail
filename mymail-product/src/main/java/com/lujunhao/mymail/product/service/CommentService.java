package com.lujunhao.mymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujunhao.common.utils.PageUtils;
import com.lujunhao.mymail.product.entity.CommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:22:53
 */
public interface CommentService extends IService<CommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

