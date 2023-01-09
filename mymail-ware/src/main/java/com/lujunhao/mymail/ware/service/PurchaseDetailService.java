package com.lujunhao.mymail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujunhao.common.utils.PageUtils;
import com.lujunhao.mymail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-07 22:35:19
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

