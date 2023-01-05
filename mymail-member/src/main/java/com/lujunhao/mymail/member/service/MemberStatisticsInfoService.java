package com.lujunhao.mymail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujunhao.common.utils.PageUtils;
import com.lujunhao.mymail.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author lujunhao
 * @email 2580101005@qq.com
 * @date 2023-01-05 15:46:23
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

