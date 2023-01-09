package com.lujunhao.mymail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujunhao.common.utils.PageUtils;
import com.lujunhao.mymail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:22:53
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

